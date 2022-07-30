import java.util.Scanner;

public class pr_6 {
    
	//function for string without string that we dont want in answer
    static void wordsWithout(String x[],String y)
    {   
		//intialize counter = 0
		int count=0;

		//loop check element 
        for(int i=0;i<x.length;i++)
        {
            if(x[i].equals(y))
            {
                count++;
            }
        }

        String[] d=new String[x.length-count];
        int j=0;//another counter = 0

		//loop for element check
        for(int i=0;i<x.length;i++)
        {
            if(x[i].equals(y))
            {}
            else
            {
                d[j]=x[i];
                j++;
            }
        }

		//loop which give final answer
        System.out.println("New Array is :");
        for(String element:d)
        {
            System.out.println(element);
        }
    }
}