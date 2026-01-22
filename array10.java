public class array10 {
    // Q167--Two Sum problem with sorted array--leetcode--medium
    public static int[] TwoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; i < numbers.length; j++) {
                if(numbers[i] + numbers[j] ==target){
                    return new int[] {i + 1, j+1};
                }

            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String args[]){
        int numbers [] = {2,7,11,15};
        int target = 9;

        int result [] =TwoSum(numbers, target);
        System.out.println("Indices : [" + result[0] + "," + result[1] + "]");
    }
}
