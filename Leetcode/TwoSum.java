import java.util.HashMap;
public class TwoSum {
    public static void main(String args[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        int nums [] ={2,7,11,15};
        int target = 9;
        for(int i=0; i<nums.length; i++){
            int current = nums[i];
            int needed =target - nums[i];
        
        if(map.containsKey(needed)){
            System.out.println(map.get(needed) + " " + i);
            return;
        }
        map.put(current,i);
    }
}
}