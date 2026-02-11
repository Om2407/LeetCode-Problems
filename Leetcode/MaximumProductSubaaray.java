public class MaximumProductSubaaray {
    public static int ProductOfSubarray(int nums[]){

        int minProd = nums[0];
        int maxProd = nums[0];
        int result = nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i]<0){
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(nums[i], maxProd * nums[i]);//(3,6*3=18)
            minProd = Math.min(nums[i], minProd * nums[i]);//(3,6*18=3)
            result = Math.max(result,maxProd);//(6,18=18)
        }
        return result;
    }
    public static void main(String args[]){
        int nums[] = {6,3,-2,4};
        System.out.println(ProductOfSubarray(nums));
    }
}
