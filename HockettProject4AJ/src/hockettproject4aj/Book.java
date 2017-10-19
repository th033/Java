package hockettproject4aj;


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
public class Book extends StoreItem
{
    private static int bookCount;
    //private String title;
    private String genre;
    public Book(String title, String author, String dateAcquired, int askingPrice, int purchasePrice, String genre)
    {
        super(title, author, dateAcquired, askingPrice, purchasePrice);
        this.genre=genre;
        bookCount+=1;
        if(bookCount==1)
        {
           super.itemCount+=1; 
        }
        
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
        }else if(bookCount==0)
        {
            super.remove();
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
        answer="\nTitle:\t\t\t\t"+title+"\nAuthor:\t\t\t\t"+author+"\nAsking Price:\t\t\t\t"+askingPrice+
                "\nPurchased for:\t\t\t\t"+purchasePrice+"\nDate Acquired:\t\t\t\t"+dateAcquired+"\nGenre:\t\\t\\t\\t\""+genre+"\nNumber on hand:\t\t\t\t"+bookCount;
        return answer;
    }
    
}
