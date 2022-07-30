import java.util.*;

public class pr_4 {

    public static int array123(int[] ar)
    {
        int c=0;

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
        return c;
    }
}
