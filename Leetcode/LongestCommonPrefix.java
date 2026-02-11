public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "*";
                }
            }
        }

        return prefix;
    }
    public static void main(String args[]) {
        String[] strs = {"flower", "flow", "flight"}; //length=3
        System.out.println(longestCommonPrefix(strs)); // Output: "fl"

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs2)); // Output: "*"
    }
}

