import java.util.Scanner;
//palindrome number
public class prblm13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();
        int reverse = 0;
        int original = num;
        while(num!=0){
            int digit = num %10;
            reverse = reverse * 10 +digit;
            num = num /10;
        }
        if(reverse == original){
            System.out.println("the number is palindrome : "+original);
        }
        else{
            System.out.println("the number is not palindrome  : "+ original);
        }
        sc.close();
    }
    
}
