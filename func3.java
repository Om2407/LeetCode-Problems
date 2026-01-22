import java.util.Scanner;
//fibonacci series
public class func3 {
    public static  void fibonacci(int n){
        int a =0,b=1;
        System.out.println("fibo series is :");
       for(int i=1; i<=n; i++){
        System.out.println(a + " ");
        int c = a+ b;
        a = b;
        b = c;

       }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  number");
        int num = sc.nextInt();
        fibonacci(num);
        sc.close();
        }
    }

