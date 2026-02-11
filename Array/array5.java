import java.util.Scanner;
//2D--Traverse
public class array5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      int rows = sc.nextInt();
      int cols = sc.nextInt();
      int nums[][] = new int[rows][cols];
    
      //inputs
      for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
nums[i][j] = sc.nextInt();
        }
      }
      int x = sc.nextInt();
      for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            if(nums[i][j] ==x){
                System.out.println("x found at : ("+ i +"," + j +")");
            }
        }
        sc.close();
      }
    }
    }


