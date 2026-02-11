import java.util.Scanner;
//fibonacci series
public class prblm8 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no's");
        int series = sc.nextInt();
        int a =0;
        int b=1;
        System.out.println("fibo series os  : " +a + " " + b);
        for(int i=0; i<series; i++){
            int c = a+b;
            System.out.println(" " +c);
            a=b;
            b=c;

        }

        sc.close();
    }
}
