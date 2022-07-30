import java.util.Scanner;

public class pr_4_1 {

    public static void main(String[] args)
    {    
        pr_4 ss = new pr_4();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter Array element : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int d = ss.array123(arr);

        if(d==1)
        System.out.println("true");

        if(d==0)
        System.out.println("false");

    }
    
}
