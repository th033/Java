
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
     * Class Name: StoreItem
     * Class Author: Tyler Hockett
     * **************************
     * Purpose of the Class
     * main item class stores different
     * attributes
     * **************************
     * Date: 10/1/2017 USA
     * **************************
     * Date Changed:
     * **************************
     * Look At This!
     * 
     * **************************
     */
public class StoreItem 
{
protected static int itemCount;
protected int purchasePrice, askingPrice;
protected String title, author;
protected Date dateAcquired;

public StoreItem(String title, String author, String dateAcquired, int purchasePrice, int askingPrice)
{
    this.title=title;
    this.author=author;
    setDateAcquired(dateAcquired);
    this.purchasePrice=purchasePrice;
    this.askingPrice=askingPrice;
    itemCount+=1;
}
 /**
     * Method Name: getTitle
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * get the title from the class
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
public String getTitle()
{
    String answer="";
    answer=title;
    return answer;
}
 /**
     * Method Name: setTitle
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * change the title variable
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
public void setTitle(String title)
{
    this.title=title; 
}
 /**
     * Method Name: getAuthor
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * get the author from the class
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
public String getAuthor()
{
    String answer="";
    answer=author;
    return answer;
}
 /**
     * Method Name: setAuthor
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * change the author variable
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
public void setAuthor(String author)
{
    this.author=author; 
}
 /**
     * Method Name: getDateAcquired
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * get the dateAcquired from the class
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
public String getDateAcquired()
{
    String answer="";
    //Date answer=null;
    answer=dateAcquired.toString();
    return answer;
}
 /**
     * Method Name: setDateAcquired
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * change the dateAcquired variable
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
public void setDateAcquired(String dateAcquired) 
{
    try {
        this.dateAcquired = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH).parse(dateAcquired);
    } catch (ParseException ex) {
        JOptionPane.showInputDialog("Dates need to be in a MM/dd/yyyy format");
    }
    
}
 /**
     * Method Name: getPuchasePrice
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * get the purchasePrice from the class
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
public String getPurchasePrice()
{
    int answer=0;
    String toReturn="";
    answer=purchasePrice;
    toReturn=Integer.toString(answer);
    return toReturn;
}
 /**
     * Method Name: setPurchasePrice
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * change the purchasePrice variable
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
public void setPurchasePrice(int purchasePrice)
{
    this.purchasePrice=purchasePrice; 
}
 /**
     * Method Name: getAskingPrice
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * get the askingPrice from the class
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
public String getAskingPrice()
{
    int answer=0;
    String toReturn="";
    answer=askingPrice;
    toReturn=Integer.toString(answer);
    return toReturn;
}
 /**
     * Method Name: setAskingPrice
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * change the askingPrice variable
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
public void setAskingPrice(int askingPrice)
{
    this.askingPrice=askingPrice;
}

//public boolean deal(int custOffer)
//{
//    boolean answer=false;
//    //accptance protecols here
//    return answer;
//}
/**
     * Method Name: remove
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * decrement the count for this object
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
public void remove()
{
    if(itemCount>0)
    {
        itemCount-=1;
    }
}
}
