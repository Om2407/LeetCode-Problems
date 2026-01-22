import java.util.Scanner;
public class array3 {
    //max and min value find krna
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a value : ");
        int size = sc.nextInt();
        int num[] = new int[size];

        //step--1
        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }
        int max = num[0];
        int min = num[0];
        for(int i=0; i<size; i++){
            if(num[i] > max){
                max = num[i];
            }
            if(num[i] < min){
                min = num[i];
            }

        }
        System.out.println("maximum : " + max);
        System.out.println("minimum : " +min);
sc.close();
    }
}
