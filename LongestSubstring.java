import java.util.HashSet;
public class LongestSubstring {
    public static int lengthOfLongestSubstring(String str) {

        HashSet<Character> set = new HashSet<>();

        int left =0;
        int right=0; 
        int maxleng =0;

        while(right<str.length()){
            char ch = str.charAt(right);

            if(!set.contains(ch)){
                set.add(ch);
                maxleng = Math.max(maxleng, right-left+1);
                right++;
            }else{
                set.remove(str.charAt(left));
                left++;
            }
        }
        return maxleng;
    }
    public static void main(String args[]){
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbb"));
        System.out.println(lengthOfLongestSubstring("pwekwe"));
    }
}