import java.util.Scanner;
import static java.lang.Math.min;

public class pr_5 {
    
    //function for match both string 
     static int stringMatch(String x,String y)
    {
        //initialize counter
        int count=0;
        //using math function fin minimum length string 
        int f=min(x.length(),y.length());

        //for loop to match both string
        for(int i=0;i<f-1;i++)
        {
            String z=x.substring(i,i+2);
            String t=y.substring(i,i+2);
            if(z.equals(t))
            {
                count++;
            }
        }
        //return counter
        return count;
    }
}