import java.util.Scanner;
//factorial series
public class prblm10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no's : ");
        int num = sc.nextInt();
        int fact = 1; //initialize factorial to 1
        for(int i=1; i<=num; i++){
            fact = fact * i;
            System.out.println("factorial of " + i + " is : " + fact);
        }

        sc.close();
    }
}
