package hockettproject4aj;


import java.io.Serializable;
import java.util.Date;

/**
     * Class Name: Book
     * Class Author: Tyler Hockett
     * **************************
     * Purpose of the Class
     * subclass of StoreItem keeps additional
     * Genre
     * **************************
     * Date: 10/1/2017 USA
     * **************************
     * Date Changed:
     * **************************
     * Look At This!
     * 
     * **************************
     */
public class Book extends StoreItem implements Serializable
{
    private static int bookCount;
    //private String title;
    private String genre;
    public Book(String title, String author, String dateAcquired, int askingPrice, int purchasePrice, String genre)
    {
        super(title, author, dateAcquired, askingPrice, purchasePrice);
        this.genre=genre;
        bookCount+=1;
        super.itemCount+=1;
    }
     /**
     * Method Name: getGenre
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * returns genre 
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
    public String getGenre()
    {
        String answer=genre;
        return answer;
    }
     /**
     * Method Name: setGenre
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * changes genre variable
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
    public void setGenre(String genre)
    {
        this.genre=genre;
    }
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
        if(bookCount>0)
        {
            bookCount-=1;
        }
    }
    /**
     * Method Name: printableString
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * get the values in string format
     * for this class
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
    public String printableString()
    {
        String answer="";
        answer="\n Title:\t"+title+"\n Author:\t"+author+"\n Asking Price:\t"+askingPrice+
                "\n Purchased for:\t"+purchasePrice+"\n Date Acquired:\t"+dateAcquired+"\n Genre:\t"+genre+"\n Number on hand:\t"+bookCount+"\n";
        return answer;
    }
     /**
     * Method Name: addCount
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * add another item when it is added but 
     * already exists
     * **************************
     * Date: 11/22/2017 USA
     * **************************
     *
     */
    public void addCount()
    {
        bookCount++;
    }
    /**
     * Method Name: getCount
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * return count for removal purpose
     * **************************
     * Date: 11/22/2017 USA
     * **************************
     *
     */
    public int getCount()
    {
        return bookCount;
    }
}
