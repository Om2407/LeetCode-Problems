import java.util.Scanner;
//find the number of digtits in a given number
public class prblm15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number  : ");
        int num = sc.nextInt();
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
                }
            System.out.println("the number of digits in the given number is : " + count);
            sc.close();
    }

}
