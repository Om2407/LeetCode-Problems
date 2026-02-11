
public class array8 {
    //two sum--Q1-Leetcode
    public static void main(String args[]){

        //initial steps
      
        int nums[] = {2,7,11,15,9};
      
        int target =9;

        for(int i=0; i<nums.length; i++){
            for(int j= i+1; j< nums.length; j++){
                //check if sum ==target
                if(nums[i] + nums[j] == target){
                    System.out.println("Indices " + i + " , " + j );
                    return;
                }
            }
        }
        System.out.println("no pair found");
    }
}
