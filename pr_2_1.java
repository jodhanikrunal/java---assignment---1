import java.util.Scanner;

public class pr_2_1 {

    public static void main(String[] args) {
        
        //object of first file class
        pr_2 ss = new pr_2();
        //object of scanner class
        Scanner sc = new Scanner(System.in);
        
        //input string 
        String s = sc.nextLine();

        //call startOz function of first file
        String answer = ss.startOz(s);
        //print answer
        System.out.println(answer);
    }
    
}
