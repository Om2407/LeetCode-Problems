import java.util.Scanner;
//find odd or even no.
public class prblm6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no's");
        int n= sc.nextInt();
        if(n%2 ==0){
            System.out.println("no's is even");

        }else{
            System.out.println("no's is odd");
        }

        sc.close();
        
    }
}
