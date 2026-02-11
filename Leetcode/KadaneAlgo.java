public class KadaneAlgo {
    public static void main(String args[]){
        int nums[] ={2,-4,3,-1,2,-4,-1,1,3,1};
        int currSum = 0;
        int maxSum = nums[0];

        for(int i=0; i<nums.length; i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum,currSum);
        }
        System.out.println(maxSum);
        System.out.println(currSum);
    }
}
