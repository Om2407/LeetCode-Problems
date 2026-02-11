import java.util.Scanner;
//calculator
public class prblm2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         System.out.println("first no.");
        int a = sc.nextInt();
        System.out.println("second no.");
        int b = sc.nextInt();
        int operator = sc.nextInt();
        switch (operator) {
            case 1:
                System.out.println("addition is :" + (a + b));
                break;
            case 2:
                System.out.println("subs is :" + (a - b));
                break;
            case 3:
                System.out.println("multi is :" + (a * b));
                break;
            case 4:
                System.out.println("division is :" + (a / b));
                break;
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }
}