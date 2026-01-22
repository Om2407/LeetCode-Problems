import java.util.Scanner;
public class array6 {
    //String --traverse in 2D
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter cols : ");
        int cols = sc.nextInt();

        String[][] names = new String[rows][cols];
        System.out.println("Enter the element of  the matrix  :");

        //inputs
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                names[i][j] = sc.next();
            }
        }
        String x = sc.next();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(names[i][j].equals(x)){
                    System.out.println("found' " + x + " at row " + i + " cols " + j);
                }
            }
            sc.close();
        }

    }
}
