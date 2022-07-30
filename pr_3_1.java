import java.util.Scanner;

public class pr_3_1 {
    public static void main(String[] args)
    {
        //object of first file class
        pr_3 ss = new pr_3();
        //object of scanner class
        Scanner sc = new Scanner(System.in);

        //enter number 1
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        //enter number 2
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();

        //call function lastDigit
        ss.lastDigit(num1,num2);
    }
    
}
