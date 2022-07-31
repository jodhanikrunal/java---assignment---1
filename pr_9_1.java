import java.util.*;
public class pr_9_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[][] sudoku = new char[9][9];
        System.out.print("Enter the sudoku you want to be checked :\n");
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                sudoku[i][j] = s.next().charAt(0);
            }
        }
        System.out.println((pr_9.isValidConfig(sudoku, 9) ? "YES" : "NO"));//calls the method isValidConfig of Darsh1_9 class file .
    }
}