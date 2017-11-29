/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hockettproject4aj;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;




/**
 *
 * @author Boss
 */
public class CreateSequentialFile 
{
    private ArrayList<StoreItem> mylist;
    private String fileName="StoreItem.ser";
public CreateSequentialFile(ArrayList<StoreItem> list)
{
    mylist=list;
}
public void saveFile()
{ 
    JOptionPane.showMessageDialog(null, "It's about to start.");
   try
   {
       FileOutputStream f = new FileOutputStream(new File("StoreItem.ser"));
       ObjectOutputStream o = new ObjectOutputStream(f);
       

           o.writeObject(mylist);

       o.close();
       f.close();
        JOptionPane.showMessageDialog(null, "It's been saved.");
   }catch(FileNotFoundException e)
   {
       JOptionPane.showMessageDialog(null,"Couldn't do that try again.");
   }catch(IOException e)
   {
       JOptionPane.showMessageDialog(null, "Error initializing stream.");
   }
}
public ArrayList<StoreItem> loadFile()
{
    mylist.clear();
    try
    {
    FileInputStream fi = new FileInputStream(new File("StoreItem.ser"));
    ObjectInputStream oi = new ObjectInputStream(fi);
    
    mylist=(ArrayList)oi.readObject();
    fi.close();
    oi.close();
    JOptionPane.showMessageDialog(null, "It's been loaded.");
    }catch(FileNotFoundException e)
    {
        JOptionPane.showMessageDialog(null, "Couldn't find that file.");
    }catch(IOException e)
    {
        JOptionPane.showMessageDialog(null, "Error initializing Stream.");
    }catch(ClassNotFoundException e)
    {
        JOptionPane.showMessageDialog(null, "Object not found.");
    }
    
    return mylist;
}
}
