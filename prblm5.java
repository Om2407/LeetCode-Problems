import java.util.Scanner;

public class prblm5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no's of row and column");
        int n = 5;
        int m = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        sc.close();
    }
}