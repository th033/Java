package hockettproject4aj;


import java.io.Serializable;
import java.util.Date;

/**
     * Class Name: Movie
     * Class Author: Tyler Hockett
     * **************************
     * Purpose of the Class
     * subclass of StoreItem keeps additional
     * Director
     * **************************
     * Date: 10/1/2017 USA
     * **************************
     * Date Changed:
     * **************************
     * Look At This!
     * 
     * **************************
     */
public class Movie extends StoreItem implements Serializable
{
private static int movieCount;
    //private String title;
    private String director;
    public Movie(String title, String author, String dateAcquired, int askingPrice, int purchasePrice, String director)
    {
        super(title, author, dateAcquired, askingPrice, purchasePrice);
        this.director=director;
        movieCount+=1;
        super.itemCount+=1;
    }
     /**
     * Method Name: getDirector
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * get the director from the class
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
    public String getDirector()
    {
        String answer=director;
        return answer;
    }
     /**
     * Method Name: setDirector
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * change the director variable
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
    public void setDirector(String director)
    {
        this.director=director;
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
        if(movieCount>0)
        {
            movieCount-=1;
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
        answer="\nTitle:\t"+title+"\nAuthor:\t"+author+"\nAsking Price:\t"+askingPrice+
                "\nPurchased for:\t"+purchasePrice+"\nDate Acquired:\t"+dateAcquired+"\nDirector:\t"+director+"\nNumber on hand:\t"+movieCount+"\n";
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
        movieCount++;
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
        return movieCount;
    }
}

