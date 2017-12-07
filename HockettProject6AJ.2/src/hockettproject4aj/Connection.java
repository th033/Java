/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hockettproject4aj;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
     * Class Name: Connection
     * Class Author: Tyler Hockett
     * **************************
     * holds all the methods to connect to db
     * **************************
     * Date: 12/7/2017 USA
     * **************************
     * Date Changed:
     * **************************
     * Look At This!
     * 
     * **************************
     */
public class Connection 
{
     /**
     * Method Name: saveBook
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * saves the object of Book to the 
     * database 
     * **************************
     * Date: 12/7/2017 USA
     * **************************
     *
     */
    public void saveBook(Book myBook) 
    {
        try{  // This try-catch statement is required for the connection to attempt to connect.

                Class.forName("com.mysql.jdbc.Driver");  // this loads the drivers for the connection. (you will need to download the mysql-connector.jar file and load it into the program.)
                java.sql.Connection myConnection=DriverManager.getConnection(  //You must open the connection.
                "jdbc:mysql://CTASV20R2DRW.tamuct.edu/talon_technology","tyler.hockett","Hockett033");   //In order to connect, the following must me provided in this order (database location, username, password.)
                Statement statement = myConnection.createStatement();  //the statement object which allows an SQL statement to be sent is initialized.
                //ResultSet resultSet=statement.executeQuery("QUERY here");  // The result set is created as a result of executing the query.
                //resultSet.next();//This loads the first line of results
                   PreparedStatement insertItem = myConnection.prepareStatement(
                   "insert into tyler_store_items (Title, Author, PurchasePrice, AskingPrice, DateAcquired, Genre)" +
                   " Values (?, ?, ?, ?, ?, ?)"
                   );
                   
                   insertItem.setString(1, myBook.title);
                   insertItem.setString(2, myBook.author);
                   insertItem.setInt(3, myBook.purchasePrice);
                   insertItem.setInt(4, myBook.askingPrice);
                   insertItem.setString(5, myBook.dateAcquired.toString());
                   insertItem.setString(6, myBook.getGenre());
                   insertItem.executeUpdate();
                   myConnection.close();  //This closes the connection so the database is not swarmed with users.
                   JOptionPane.showMessageDialog(null, "Book added.");
               } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
//        catch(HeadlessException | ClassNotFoundException | SQLException e) // this catches whatever exception may be thrown
//        {  JOptionPane.showMessageDialog(null, "Unable to connect to server to add Book.");}    
    }
         /**
     * Method Name: saveMove
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * saves the object of movie to the 
     * database 
     * **************************
     * Date: 12/7/2017 USA
     * **************************
     *
     */
    public void saveMovie(Movie myMovie)
    {
        try{  // This try-catch statement is required for the connection to attempt to connect.

                Class.forName("com.mysql.jdbc.Driver");  // this loads the drivers for the connection. (you will need to download the mysql-connector.jar file and load it into the program.)
                java.sql.Connection myConnection=DriverManager.getConnection(  //You must open the connection.
                "jdbc:mysql://CTASV20R2DRW.tamuct.edu/talon_technology","tyler.hockett","Hockett033");   //In order to connect, the following must me provided in this order (database location, username, password.)
                Statement statement = myConnection.createStatement();  //the statement object which allows an SQL statement to be sent is initialized.
                //ResultSet resultSet=statement.executeQuery("QUERY here");  // The result set is created as a result of executing the query.
                //resultSet.next();//This loads the first line of results
                PreparedStatement insertItem = myConnection.prepareStatement(
                   "insert into tyler_store_items (Title, Author, PurchasePrice, AskingPrice, DateAcquired, Director)" +
                   " Values (?, ?, ?, ?, ?, ?)"
                   );
                   
                   insertItem.setString(1, myMovie.title);
                   insertItem.setString(2, myMovie.author);
                   insertItem.setInt(3, myMovie.purchasePrice);
                   insertItem.setInt(4, myMovie.askingPrice);
                   insertItem.setString(5, myMovie.dateAcquired.toString());
                   insertItem.setString(6, myMovie.getDirector());
                   insertItem.executeUpdate();
                   myConnection.close();  //This closes the connection so the database is not swarmed with users.
                   JOptionPane.showMessageDialog(null, "Movie added.");
            }
        catch(HeadlessException | ClassNotFoundException | SQLException e) // this catches whatever exception may be thrown
        {  JOptionPane.showMessageDialog(null, "Unable to connect to server to add Movie.");}    
    }
         /**
     * Method Name: savepainting
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * saves the object of painting to the 
     * database 
     * **************************
     * Date: 12/7/2017 USA
     * **************************
     *
     */
    public void savePainting(Painting myPainting)
    {
        try{  // This try-catch statement is required for the connection to attempt to connect.

                Class.forName("com.mysql.jdbc.Driver");  // this loads the drivers for the connection. (you will need to download the mysql-connector.jar file and load it into the program.)
                java.sql.Connection myConnection=DriverManager.getConnection(  //You must open the connection.
                "jdbc:mysql://CTASV20R2DRW.tamuct.edu/talon_technology","tyler.hockett","Hockett033");   //In order to connect, the following must me provided in this order (database location, username, password.)
                Statement statement = myConnection.createStatement();  //the statement object which allows an SQL statement to be sent is initialized.
                //ResultSet resultSet=statement.executeQuery("QUERY here");  // The result set is created as a result of executing the query.
                //resultSet.next();//This loads the first line of results
                PreparedStatement insertItem = myConnection.prepareStatement(
                   "insert into tyler_store_items (Title, Author, PurchasePrice, AskingPrice, DateAcquired, Media, Height, Width)" +
                   " Values (?, ?, ?, ?, ?, ?, ?, ?)"
                   );
                   
                   insertItem.setString(1, myPainting.title);
                   insertItem.setString(2, myPainting.author);
                   insertItem.setInt(3, myPainting.purchasePrice);
                   insertItem.setInt(4, myPainting.askingPrice);
                   insertItem.setString(5, myPainting.dateAcquired.toString());
                   insertItem.setString(6, myPainting.getMedia());
                   insertItem.setString(7, myPainting.getHeight());
                   insertItem.setString(8, myPainting.getWidth());
                   insertItem.executeUpdate();
                   myConnection.close();
                JOptionPane.showMessageDialog(null, "Painting added.");
            }
        catch(HeadlessException | ClassNotFoundException | SQLException e) // this catches whatever exception may be thrown
        {  JOptionPane.showMessageDialog(null, "Unable to connect to server to add Painting.");}    
    }
         /**
     * Method Name: removeItem
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * deletes a sold item from the database
     * **************************
     * Date: 12/7/2017 USA
     * **************************
     *
     */
    public void removeItem(int itemNumber)
    {
        try{
            
            Class.forName("com.mysql.jdbc.Driver");  // this loads the drivers for the connection. (you will need to download the mysql-connector.jar file and load it into the program.)
                    java.sql.Connection myConnection=DriverManager.getConnection(  //You must open the connection.
                    "jdbc:mysql://CTASV20R2DRW.tamuct.edu/talon_technology","tyler.hockett","Hockett033");   //In order to connect, the following must me provided in this order (database location, username, password.)
                    Statement statement = myConnection.createStatement();  //the statement object which allows an SQL statement to be sent is initialized.
                    PreparedStatement insertItem = myConnection.prepareStatement(
                   "delete from tyler_store_items where ItemNumber = " +itemNumber+";"
                   );
                    insertItem.executeUpdate();
                    myConnection.close();  //This closes the connection so the database is not swarmed with users.
                    JOptionPane.showMessageDialog(null, "Item Sold!");
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e) // this catches whatever exception may be thrown
        {  JOptionPane.showMessageDialog(null, "Unable to connect to server.");}
    }
         /**
     * Method Name: getAll
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * returns all items from the 
     * database
     * **************************
     * Date: 12/7/2017 USA
     * **************************
     *
     */
    public String getAll()
    {
        String answer="";
        try{
            
            Class.forName("com.mysql.jdbc.Driver");  // this loads the drivers for the connection. (you will need to download the mysql-connector.jar file and load it into the program.)
                    java.sql.Connection myConnection=DriverManager.getConnection(  //You must open the connection.
                    "jdbc:mysql://CTASV20R2DRW.tamuct.edu/talon_technology","tyler.hockett","Hockett033");   //In order to connect, the following must me provided in this order (database location, username, password.)
                    Statement statement = myConnection.createStatement();  //the statement object which allows an SQL statement to be sent is initialized.
                    ResultSet resultSet=statement.executeQuery("select * From tyler_store_items;");  // The result set is created as a result of executing the query.
//                    resultSet.next();//This loads the first line of results
                    while(resultSet.next())
                    {
                        answer+=("Item number: " +resultSet.getInt(1)+" Title: "+ resultSet.getString(2)+" Author: "+resultSet.getString(3)+" Purchase Price "+resultSet.getString(4)+" Asking Price "
                                +resultSet.getString(5)+" Date Acquired "+resultSet.getString(6)+" Genre "+resultSet.getString(7)+ " Height "+resultSet.getString(8)
                                +" Width "+resultSet.getString(9)+" Media "+resultSet.getString(10)+"Director "+resultSet.getString(11)+"\n");
                    }
                    myConnection.close();  //This closes the connection so the database is not swarmed with users.

        }
        catch(HeadlessException | ClassNotFoundException | SQLException e) // this catches whatever exception may be thrown
        {  JOptionPane.showMessageDialog(null, "Unable to connect to server.");}
        return answer;
    }
}
            

