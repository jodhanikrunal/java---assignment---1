import java.util.*;

public class pr_4 {

    public static int array123(int[] ar)
    {
        //initialize counter 0
        int c=0;

        //for loop to check sequence of 1 2 3
        for(int i=0 ;i < ar.length-2 ; i++)
        {
            if(ar[i]==1)
            {
                if(ar[i+1]==2)
                {
                    if(ar[i+2]==3)
                    {
                        c=1;
                        break;
                    }
                }
            }
            else
            continue;
        }
        //return counter variable
        return c;
    }
}
