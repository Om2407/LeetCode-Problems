import java.util.Scanner;
//exercise 1 --sum of 3 numbers(input from user)
public class func4 {
    public static void printSum(int a, int b, int c, int sum){
        sum = (a+b+c)/3;
        System.out.println("The average of " + a + ", " + b + ", and " + c + " is: " + sum);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        int sum = 0;
        printSum(num, num1, num2, sum);
        sc.close();
    }
}
