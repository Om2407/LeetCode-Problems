import java.util.Scanner;
//prime function
public class func2 {
    public static boolean isPrime(int n){
        if( n<=1){
            return false;
        }
    
        int limit = (int) Math.sqrt(n);
        for(int i=2; i<=limit; i++){
            if(n % i ==0){
                return false;
            }
        }
            return true;
        
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number for prime check : ");
    int num = sc.nextInt();
    
    if(isPrime(num)){
        System.out.println(num + " is a prime number.");
    }else{
        System.out.println(num + " is not a prime number.");
    }
    sc.close();
}
    }
