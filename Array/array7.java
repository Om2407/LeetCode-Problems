import java.util.Scanner;
public class array7 {
    //Transpose in 2D
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a rows  : ");
        int rows = sc.nextInt();
        System.out.println("Enter a cols : ");
        int cols = sc.nextInt();
        int nums[][] = new int[rows][cols];

        //inputs
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                nums[i][j]  = sc.nextInt();
          
            } 
        }
        System.out.println("Transpose");
        //output--logic reverse
        for(int j=0; j<cols; j++){
            for(int i=0; i<rows; i++){
                System.out.print(nums[i][j]+ " ");//
            }
            System.out.println();
        }
        sc.close();
    }
    
}
