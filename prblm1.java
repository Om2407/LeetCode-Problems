import java.util.Scanner;
public class prblm1{
public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("table of number n");
     int n= sc.nextInt();
     for(int i=1; i<=10; i++){
        System.out.println(n + " * " + i + " = " + (n * i));

     }
    // System.out.println("enter the value of radius");
    //  int r= sc.nextInt();
    //  double area = Math.PI * r* r;
    //  System.out.println("here the radius is: " + area);
     
    sc.close();
}
}