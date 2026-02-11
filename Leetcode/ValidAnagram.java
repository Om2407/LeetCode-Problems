public class ValidAnagram {
    public static boolean validAnagram(String s, String t){

        if (s.length() != t.length()) {
            return false;
        }

        int nums[] = new int[26];

        // count s
        for(int i = 0; i < s.length(); i++){
            nums[s.charAt(i) - 'a']++;
        }

        // subtract using t
        for(int i = 0; i < t.length(); i++){
            nums[t.charAt(i) - 'a']--;

            if(nums[t.charAt(i) - 'a'] < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        System.out.println(validAnagram("anagram", "nagaram")); 
        System.out.println(validAnagram("car", "rat"));

    }
}
