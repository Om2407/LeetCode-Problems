import java.util.Scanner;
//q5 from exercise 1
public class func7 {
    public static void printVote(int age){
        if(age<18){
            System.out.println("you are not eligible to vote yet");
           
        }
        if(age>=18 && age<=60){
            System.out.println("you are eligible to vote : ");
            
        }
       
        }
       
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the age of a person  :");
            int num = sc.nextInt();
            printVote(num);

            sc.close();
    }
    
}
