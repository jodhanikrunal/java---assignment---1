import java.util.Scanner;

public class pr_6_1 {

    public static void main(String[] args) {

        //object of main file
        pr_6 ss =new pr_6();
        //object of scanner class
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int a = sc.nextInt();

        String[] b=new String[a];
        System.out.println("Enter array : ");
        //for loop for input array
        for(int i=0;i<b.length;i++)
        {
            b[i]=sc.next();
        }
        //enter elment you want to remive
        System.out.println("Enter string you want to remove");
        String c=sc.next();

        //function call for final answer
        ss.wordsWithout(b,c);

        }

}