public class array15 {
    //Q35 --leetcode
    public static int SearchInsertPos(int nums[]){
        
        int target = 5;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
return nums.length;
    }
    public static void main(String args[]){
          int nums[] = {1,3,5,7};
          int result = SearchInsertPos(nums);
          System.out.println("target index value : " + result);
    }
    
}
