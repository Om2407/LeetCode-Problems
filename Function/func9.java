import java.util.Scanner;
//greatest no. blw two digits
public class func9 {
    public static void Twonum(int a, int b){
        if(a >b){
            System.out.println("the greatest number is a : " +a);
            return;
        }
        if(a<b){
            System.out.println("the greatest number is b : " +b);
            return;
        }
        if(a == b){
            System.out.println("both numbers are equal");
            return;
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.println("enter two numbers to find the greatest number : ");
    int a = sc.nextInt();
    int b= sc.nextInt();
     Twonum(a,b);
    sc.close();
    }
    
}
