import java.util.*;
public class SortArrayIncreFreq {
    // Sort the array in increasing order of frequency. If two numbers have the same frequency, sort them in decreasing order.
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
    // for(int i=0; i<nums.length; i++){
    //     freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
    // }
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        Integer[] numsBoxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numsBoxed, (a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);
            if (freqA == freqB) {
                return b - a; // Sort in decreasing order if frequencies are the same
            }
            return freqA - freqB; // Sort in increasing order of frequency
        });

        return Arrays.stream(numsBoxed).mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        SortArrayIncreFreq obj = new SortArrayIncreFreq();
        int[] nums = {1, 1, 2, 2, 3};
        int[] sorted = obj.frequencySort(nums);
        System.out.println(Arrays.toString(sorted));
    }
}
