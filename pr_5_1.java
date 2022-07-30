import java.util.Scanner;

public class pr_5_1 {

    public static void main(String[] args) 
    {
        //create object of main file
        pr_5 ss = new pr_5();
        //create object of scanner class 
        Scanner sc=new Scanner(System.in);

        //enter first string
        System.out.println("Enter first string : ");
        String a=sc.next();
        
        //enter second string
        System.out.println("Enter second string : ");
        String b=sc.next();

        //function call for output
        int c=ss.stringMatch(a,b);
        //output of how many element is match
        System.out.println(c);
    }
    
}
