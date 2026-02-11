import java.util.Scanner;
//swapping the no;s
public class prblm9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
     
        int temp;
        int a =sc.nextInt();
        System.out.println("before swapping a is : " + a);
        int b = sc.nextInt();
        System.out.println("before swapping b is : " + b);
        //swapping
       temp = a;
       a = b;
       b = temp;
       System.out.println("after swapping a is  : " + a);
       System.out.println("after swapping b is  : " + b);
        sc.close();
    }
}
