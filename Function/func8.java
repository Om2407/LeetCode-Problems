import java.util.Scanner;
//q8 from exercise 1
public class func8 {
    public static void printPowerof(int x, int n){
        if(x ==0 && n==0){
            System.out.println("invalid");
            return;
        }else if( x<0 && n<0){
            System.out.println("invalid");
            return;
        }
        int result =1;
        for(int i=1; i<=n; i++){
            result = result *x;
        }
        return;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x : ");
        int x = sc.nextInt();
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();
        printPowerof(x, n);
        sc.close();
    }
    
}
