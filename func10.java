import java.util.Scanner;

public class func10 {

    // Function to find GCD of two numbers
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find GCD with 5: ");
        int num = sc.nextInt();

        int result = findGCD(5, num); // GCD of 5 and user input

        System.out.println("GCD of 5 and " + num + " is: " + result);

        sc.close();
    }
}
