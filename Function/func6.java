import java.util.Scanner;
//q4 from exercise 1
public class func6 {
    public static int findCircle(int r){
        if(r<=0){
            return 0;
        }
        double circumference = 2 * Math.PI *r;
        return (int) Math.round(circumference);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius  : ");
        int radius = sc.nextInt();
        int result =findCircle(radius);
        System.out.println("circumference of the circle : " + result);
        sc.close();
    }
}
