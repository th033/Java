/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author th033
 */
public class Server extends JFrame
{
    private JTextField enterField;
    private JTextArea displayArea;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private ServerSocket server;
    private Socket connection;
    private int counter=1;
    
    public Server()
    {
        super("Server");
        enterField=new JTextField();
        enterField.setEditable(false);
        enterField.addActionListener(
        new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                sendData(event.getActionCommand());
                {
                    enterField.setText("");
                }
            }
        });
        
        add(enterField, BorderLayout.NORTH);
        
        displayArea=new JTextArea();
        add(new JScrollPane(displayArea), BorderLayout.CENTER);
        
        setSize(300, 150);
        setVisible(true);
    }//end constructor
    
    public void runServer()
    {
        try//set up server to recieve connections; process connections
        {
            server=new ServerSocket(12345,100);
            while(true)
            {
                try
                {
                    waitForConnection();
                    getStreams();
                    processConnection();
                   
                }
                catch(EOFException eofException)
                {
                    displayMessage("\nServer terminated connection");
                }
                finally
                {
                    closeConnection();
                    ++counter;
                }
            }//end while
        }//end try
        catch(IOException ioException)
        {
            ioException.printStackTrace();
        }
    }//end runServer
    private void waitForConnection()throws IOException
    {
        displayMessage("Waiting for Connection\n");
        connection = server.accept();//allow server to accept connections
        displayMessage("Connection "+counter+" recieved from: "+connection.getInetAddress().getHostName());
    }
    private void getStreams() throws IOException
    {
        output=new ObjectOutputStream(connection.getOutputStream());
        output.flush();
        
        input= new ObjectInputStream(connection.getInputStream());
        
        displayMessage("\nGot I/0 streams\n");
    }
    
    private void processConnection() throws IOException
    {
        String message = "Connection successful";
        sendData(message);
        
        setTextFieldEditable(true);
        
        do
        {
            try
            {
                message=(String)input.readObject();
                displayMessage("\n"+message);               
            }
            catch(ClassNotFoundException classNotFoundException)
            {
                displayMessage("\nUnknown object type received");
            }//end catch         
        } while(!message.equals("CLIENT>>> TERMINATE"));
    }//end method
    
    private void closeConnection()
    {
        displayMessage("\nTerminating Connection\n");
        setTextFieldEditable(false);
        try
        {
            output.close();
            input.close();
            connection.close();
        }catch(IOException ioException)
        {
            ioException.printStackTrace();
        }
    }//end method
    
    private void sendData(String message)
    {
        try
        {
            output.writeObject("SERVER>>>"+message);
            output.flush();
            displayMessage("\nSERVER>>>"+message);
        }catch(IOException ioException)
        {
            displayArea.append("\nError writing object");
   
        }
    }//end method
    
    private void displayMessage(final String messageToDisplay)
    {
        SwingUtilities.invokeLater(
        new Runnable()
                {
                    public void run()
                    {
                        displayArea.append(messageToDisplay);
                    }//end run
                });//end inner class
    }//end method
    private void setTextFieldEditable(final boolean editable)
    {
        SwingUtilities.invokeLater(
        new Runnable()
        {
            public void run()
            {
                enterField.setEditable(editable);
            }
        });
    }//end method
}//end class
