public class EquilibriumIndex {
    public static int PivotIndex(int nums[]){

        int rightSum = 0;
        for(int i=0; i<nums.length; i++){ //1
            rightSum = rightSum + nums[i]; //total krega aur rightSUm = 28 hoga
        }
        int leftSum = 0;
        for(int i=0; i<nums.length; i++){ //2
            rightSum = rightSum - nums[i];

            if(leftSum == rightSum){
                return i;

            }
            leftSum = leftSum + nums[i];
        }
        return -1;
    }
    public static void main(String args[]){
        int nums [] = {1,3,7,0,5,6};
        System.out.println(PivotIndex(nums));
        }
}
