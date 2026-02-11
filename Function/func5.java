import java.util.Scanner;
//Q2 from exercise 1
public class func5 {
    public static int SumofOdd(int n){
        int sum =0;
        for(int i=1; i<=n; i++){
            if(i % 2!=0){
                sum = sum +i;
                        }
        }
   
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number  :");
        int num = sc.nextInt();
        int result = SumofOdd(num);
        System.out.println("sum of odd numbers  " +num + " is : " +result);
        sc.close();
    }

    
}
