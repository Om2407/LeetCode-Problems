import java.util.Scanner;
public class prblm14 {
    //calculate the sum of digits of a number
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to calculate the sum of digits : ");
        int num = sc.nextInt();
        int sum = 0;
        while(num!=0){
            int digit = num %10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("the sum of digits is : " + sum);
        sc.close();
    }
    
}
