/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hockettproject4aj;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
     * Class Name: GUI
     * Class Author: Tyler Hockett
     * **************************
     * Purpose of the Class
     * Creates the components of the GUI
     * **************************
     * Date: 10/17/2017 USA
     * **************************
     * Date Changed:
     * **************************
     * Look At This!
     * 
     * **************************
     */
public class GUI extends JFrame
{
    ArrayList<StoreItem> list=new ArrayList<StoreItem>();
    StoreItem book;
    StoreItem movie;
    StoreItem painting;
    
    
    
    private final JLabel jLabel1,jLabel2,jLabel3,jLabel4, jLabel5,lblType,lblHeight,lblWidth,lblWarning;//lblNum;
    private final JTextField txtTitle, txtAuthor, txtDate, txtPurchase, txtAsking, txtType, txtWidth, txtHeight;//txtNum;
    private final JButton btnAdd, btnRemove, btnGetAll,btnSaveToDB;
    private final JRadioButton radBook, radMovie, radPainting;
    private final JTextArea txtAItems;
    public GUI()
    {
        
        radBook=new JRadioButton("Book",true);
        add(radBook);
        radMovie=new JRadioButton("Movie",false);
        add(radMovie);
        radPainting=new JRadioButton("Painting",false);
        add(radPainting);
        ButtonGroup bg=new ButtonGroup();
        bg.add(radBook);
        bg.add(radMovie);
        bg.add(radPainting);
        setLayout(new FlowLayout());
////////////        lblNum=new JLabel("Item Number (If new item leave blank):");
////////////        add(lblNum);
////////////        txtNum= new JTextField();
////////////        add(txtNum);
        jLabel1=new JLabel("Title:");
        add(jLabel1);
        txtTitle= new JTextField();
        add(txtTitle);
        jLabel2=new JLabel("Author:");
        add(jLabel2);
        txtAuthor= new JTextField();
        add(txtAuthor);
        jLabel3=new JLabel("Date Acquired: (MM/dd/yyyy)");
        add(jLabel3);
        txtDate= new JTextField();
        add(txtDate);
        //HERE aksldfjalksjfl;asjdflksajflksajdflkasdjfklsdajflksdajflksdajflksdajfl;ksdjflkasdjflksadjflksdjfl;ksdj
        lblType=new JLabel("Genre:");
        add(lblType);
        txtType= new JTextField();
        add(txtType);
        jLabel4=new JLabel("Asking:");
        add(jLabel4);
        txtAsking= new JTextField();
        add(txtAsking);
        jLabel5=new JLabel("Purchase for:");
        add(jLabel5);
        txtPurchase= new JTextField();
        add(txtPurchase);
        lblHeight=new JLabel("Height:");
        add(lblHeight);
        txtHeight= new JTextField();
        add(txtHeight);
        lblWidth=new JLabel("Width:");
        add(lblWidth);
        txtWidth= new JTextField();
        add(txtWidth);
         //set sizes
        txtTitle.setColumns(10);
        txtPurchase.setColumns(10);
        txtAuthor.setColumns(10);
        txtAsking.setColumns(10);
        txtType.setColumns(10);
        txtWidth.setColumns(10);
        txtHeight.setColumns(10);
        txtDate.setColumns(10);
        txtWidth.setVisible(false);
        lblWidth.setVisible(false);
        txtHeight.setVisible(false);
        lblHeight.setVisible(false);
        
        btnAdd=new JButton("Add to Inventory");
        add(btnAdd);
        btnSaveToDB=new JButton("Save to DataBase");
        add(btnSaveToDB);
        btnRemove=new JButton("Sold Item");
        add(btnRemove);
//        btnSearch=new JButton("Search(Title)");
//        add(btnSearch);
        btnGetAll=new JButton("Get All Items");
        add(btnGetAll);
        //btnSave=new JButton("Save Inventory");
        //add(btnSave);
        lblWarning=new JLabel("");
        add(lblWarning);
        txtAItems=new JTextArea(25,20);
        add(txtAItems);
        //handlers
        RadioButtonHandler rbh =new RadioButtonHandler();
        radBook.addItemListener(rbh);
        radMovie.addItemListener(rbh);
        radPainting.addItemListener(rbh);
        ButtonHandler bh=new ButtonHandler();
        btnAdd.addActionListener(bh);
        btnRemove.addActionListener(bh);
        //btnSearch.addActionListener(bh);
        btnGetAll.addActionListener(bh);
        //btnSave.addActionListener(bh);
        btnSaveToDB.addActionListener(bh);
       
    }
    
   /**
     * Class Name: RadioButtonHandler
     * Class Author: Tyler Hockett
     * **************************
     * Purpose of the Class
     * acts as the itemlistener for the 
     * radio buttons
     * **************************
     * Date: 10/17/2017 USA
     * **************************
     * Date Changed:
     * **************************
     * Look At This!
     * 
     * **************************
     */ 
    private class RadioButtonHandler implements ItemListener
    {
        //handle radio button events
        @Override
     /**
     * Method Name: itemStateChanged
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * depending on which radio button is selected it 
     * will show the appropriate text and options
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
        public void itemStateChanged(ItemEvent event)
        {
            if(radBook.isSelected())
            {
                lblWidth.setVisible(false);
                lblHeight.setVisible(false);
                txtWidth.setVisible(false);
                txtHeight.setVisible(false);
                lblType.setText("Genre:");
            }else if(radMovie.isSelected())
            {
                lblWidth.setVisible(false);
                lblHeight.setVisible(false);
                txtWidth.setVisible(false);
                txtHeight.setVisible(false);
                lblType.setText("Director:");
            }else if(radPainting.isSelected())
            {
                lblWidth.setVisible(true);
                lblHeight.setVisible(true);
                txtWidth.setVisible(true);
                txtHeight.setVisible(true);
                lblType.setText("Media:");
            }
        }
    }
    /**
     * Class Name: ButtonHandler
     * Class Author: Tyler Hockett
     * **************************
     * Purpose of the Class
     * Acts as the action listner for the 
     * buttons
     * **************************
     * Date: 10/17/2017 USA
     * **************************
     * Date Changed:
     * **************************
     * Look At This!
     * 
     * **************************
     */
    ///THESE SECTIONS
    private class ButtonHandler implements ActionListener
    {
        //handle button events
        @Override
         /**
     * Method Name: actionPerformed
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * depending on which button is pressed
     * it will trigger the appropriate code
     * 
     * **************************
     * Date: 10/17/2017 USA
     * **************************
     *
     */
        public void actionPerformed(ActionEvent event)
        {
            Connection myConnection= new Connection();
            if(event.getSource()==btnAdd||event.getSource()==btnSaveToDB)
            {
                    
                    try
                    {
                        if(radBook.isSelected())
                        {
                            book = new Book(txtTitle.getText(), txtAuthor.getText(), txtDate.getText(),Integer.parseInt(txtAsking.getText()), Integer.parseInt(txtPurchase.getText()),txtType.getText());
                            myConnection.saveBook((Book)book);
                    }
                     else if(radMovie.isSelected())
                    {
                          movie = new Movie(txtTitle.getText(), txtAuthor.getText(), txtDate.getText(),Integer.parseInt(txtAsking.getText()), Integer.parseInt(txtPurchase.getText()),txtType.getText());
                          myConnection.saveMovie((Movie)movie);
                        
                    }
                    else if(radPainting.isSelected())
                    {
                        painting = new Painting(txtTitle.getText(), txtAuthor.getText(), txtDate.getText(),Integer.parseInt(txtAsking.getText()), Integer.parseInt(txtPurchase.getText()),Integer.parseInt(txtHeight.getText()),Integer.parseInt(txtWidth.getText()),txtType.getText());
                        myConnection.savePainting((Painting)painting);   
                    }
                    
                }
        catch(Exception e)
        {
          lblWarning.setText("Couldn't add that item. Please make sure all categories are correct.");
        }
       
//            }else if(event.getSource()==btnSave)
//                    {
//                        
//                        JOptionPane.showMessageDialog(null, "btnSave has been used.");
//                        CreateSequentialFile csf = new CreateSequentialFile(list);
//                        csf.saveFile();
//                        list.clear();
//                        list=csf.loadFile();
//                    }
            }else if(event.getSource()==btnRemove)
            {
                //btnRemove here
                int answer=Integer.parseInt(JOptionPane.showInputDialog("Item Number:"));
                myConnection.removeItem(answer);  
            }else if(event.getSource()==btnGetAll)
            {
                txtAItems.setText(myConnection.getAll());
            }
        }
    }
     /**
     * Method Name: findPosition
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * finds the index position for the list
     * when searching
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
    private int findPosition(String title)
    {
        int position=-1;
        for(int i=0;i<list.size();i++)
        {
            StoreItem temp=list.get(i);
            if(temp.title==title)
            {
                position=i;
                break;
            }
        }
        return position;
    }
    //TO HERE
}
