import java.util.Scanner;

public class array2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your inputs");
        int size = sc.nextInt();
        String Names[] = new String[size];

        for (int i = 0; i < size; i++) {
            Names[i] = sc.next();
        }
        String x = sc.next();
        for (int i = 0; i < Names.length; i++) {
            if (Names[i].equals(x)) {
                System.out.println("x found at : " + i);
            }
        }
        sc.close();
    }
}
