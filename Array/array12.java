public class array12 {
    //Q27--leetcode-easy
    public static int removeElement(int[] nums, int val){
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
    public static void main(String args[]){
        int nums[] = {3,2,2,3};
        int result = removeElement(nums, 3);
        System.out.println("value of k : " + result);
    }
}
