import java.util.Scanner;
public class array4 {
    //descending order m sort krna
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value : ");
        int size = sc.nextInt();
        int num [] =new int[size];

        //input
        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for(int i=0; i<num.length-1; i++){
            if(num[i] < num[i+1]){
                isAscending = false;
            }

        }
        if(isAscending){
            System.out.println("the array is sorted  :");
        }else{
            System.out.println("not sorted");
        }
        sc.close();
    }
}
