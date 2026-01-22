import java.util.Scanner;

public class prblm12 {
    //Armstring number 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an armstrong number : ");
        int num = sc.nextInt();
        int original = num;
        int result = 0;
        while(num!=0){
            int digit = num % 10;
            result += digit * digit *digit;
            num = num /10;

        }
        if(result== original){
            System.out.println("the number is an armstrong number : "+original);

        }
        else{
            System.out.println("the number is not an armstrong number : "+original);
        }
        sc.close();
    }
}
