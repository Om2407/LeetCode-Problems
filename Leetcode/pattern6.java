public class pattern6 {
    //pascal triangle
    public static void main(String args[]){
        int n= 5;
        for(int i=0; i<n; i++){ //initialize 0 se hoga 1 se nhi
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //main step
            int value = 1; //har value 1 se start hogi isliye
            for(int j=0; j<=i; j++){//initialize 0 se hoga 1 se nhi
                System.out.print(value + " ");
                //main logic
                value = value * (i-j)/(j+1);

            } 
            System.out.println();
        }

    }
}
