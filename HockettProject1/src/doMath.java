
import javax.swing.JOptionPane;

/**
     * Class Name: doMath
     * Class Author: Tyler Hockett
     * **************************
     * Purpose of the Class
     * to calculate numbers
     * into an average and standard dev.
     * **************************
     * Date: 9/5/2017 USA
     * **************************
     * Date Changed:9/6/2017 USA
     * **************************
     * Look At This!
     * Its all pretty cool. 
     * 
     * **************************
     */
public class doMath 
{
   private double[] list = new double[10];
   private double number;
   private double avg;
   private double SD;
   private int count=0;
   private String answer=" ";
   /**
     * Method Name: addThis
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * to pass input value into a 
     * private method
     * **************************
     * Date: 9/6/2017 USA
     * **************************
     */
   public void addThis(String value)
   {
       validate(value);
   }
      /**
     * Method Name: validate
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * to validate input from user
     * **************************
     * Date: 9/6/2017 USA
     * **************************
     */
   private void validate(String value)
   {
       try
       {
            number = Double.parseDouble(value);
            list[count]=number;
            count++;
       }
       catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, e+"\nPlease enter a number:");
        }
    }
    /**
     * Method Name: writeThis
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * to pass the calculated value 
     * back to the user
     * **************************
     * Date: 9/6/2017 USA
     * **************************
     */
   public String writeThis()
   {
    answer+=" "+Double.toString(number);
    return answer;
   }
    /**
     * Method Name: findAnswer
     * Method Author: Tyler Hockett
     * **************************
     * to calculate the average
     * and standard deviation
     * **************************
     * Date: 9/6/2017 USA
     * **************************
     */
   public void findAnswer()
   {       
       for(double number:list)
       {
           avg+=number;
       }
       avg= avg/10;
       for(double number:list)
       {
           SD+=Math.pow(number-avg, 2.0);
       }
       SD=SD/9;
       SD = Math.sqrt(SD);
   }
    /**
     * Method Name: writeAvg
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * to pass the average back to user
     * **************************
     * Date: 9/6/2017 USA
     * **************************
     */
   public String writeAvg()
   {
       answer=Double.toString(avg);
       return answer;
   }
    /**
     * Method Name: writeSD
     * Method Author: Tyler Hockett
     * **************************
     * Purpose of the method
     * to pass the standard deviation
     * back to user
     * **************************
     * Date: 9/6/2017 USA
     * **************************
     */
   public String writeSD()
   {
       answer=Double.toString(SD);
       return answer;
   }
}
