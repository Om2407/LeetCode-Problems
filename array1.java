import java.util.Scanner;
//Seraching in Array
public class array1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        // print the number in array
        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("x found at : " + i);
            }

        }

        sc.close();
    }
}
