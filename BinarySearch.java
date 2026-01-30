public class BinarySearch {
    public static void main(String args[]){
        int nums[] ={1,3,5,7,9,11,13,15}; //8
        int target = 15;

        int low = 0;
        int high = nums.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] ==target){
                System.out.println(mid);
                return;
            }else if(nums[mid] < target){
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        System.out.println("Jai Ho : " + -1);
    }
}
//nums[15] = 8(index) ---output