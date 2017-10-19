package hockettproject4aj;

import java.util.Date;

/**
     * Class Name: Painting
     * Class Author: Tyler Hockett
     * **************************
     * Purpose of the Class
     * is a subclass of StoreItem keeps
     * additional height and width and media
     * **************************
     * Date: 10/1/2017 USA
     * **************************
     * Date Changed:
     * **************************
     * Look At This!
     * 
     * **************************
     */
public class Painting extends StoreItem
{
    private static int paintingCount;
    private int height, width;
    //private String title;
    private String media;
    public Painting(String title, String author, String dateAcquired, int askingPrice, int purchasePrice, int height, int width, String media)
    {
        super(title, author, dateAcquired, askingPrice, purchasePrice);
        this.media=media;
        this.height=height;
        this.width=width;
        paintingCount+=1;
        if(paintingCount==1)
        {
           super.itemCount+=1; 
        }
    }
     /**
     * Method Name: getMedia
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * get the media from the class
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
    public String getMedia()
    {
        String answer=media;
        return answer;
    }
    /**
     * Method Name: setMedia
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * change the media variable
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
   public void setMedia(String media)
    {
        this.media=media;
    }
     /**
     * Method Name: getHeight
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * get the height from the class
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
   public String getHeight()
    {
        String answer=Integer.toString(height);
        return answer;
    }
    /**
     * Method Name: setHeight
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * change the height variable
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
   public void setHeight(String height)
    {
        this.height=Integer.parseInt(height);
    }
    /**
     * Method Name: getwidth
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * get the width from the class
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
   public String getWidth()
    {
        String answer=Integer.toString(width);
        return answer;
    }
    /**
     * Method Name: setWidth
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * change the witdh variable
     * **************************
     * Date: 10/3/2017 USA
     * **************************
     *
     */
   public void setWidth(String width)
    {
        this.width=Integer.parseInt(width);
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
        if(paintingCount>0)
        {
            paintingCount-=1;
        }else if(paintingCount==0)
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
                "\nPurchased for:\t\t\t\t"+purchasePrice+"\nDate Acquired:\t\t\t\t"+dateAcquired+"Height:\t\t\t\t"+
                height+"\nWidth:\t\t\t\t"+width+"\nMedia:\t\t\t\t"+media+"/nNumber on Hand:\t\t\t\t"+paintingCount;
        return answer;
    }
  
}
