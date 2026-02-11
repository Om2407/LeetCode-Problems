import java.util.Scanner;
public class prblm7 {
    //check prime no's
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n= sc.nextInt();
        boolean isPrime = true;
        if(n <=1){
            isPrime = false;

        }else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n % i ==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("no. is a prime");
        }else{
            System.out.println("not a prime no..");
        }
        sc.close();
    }
}
