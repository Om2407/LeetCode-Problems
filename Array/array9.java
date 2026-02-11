
public class array9 {
 //Q14--leetcode
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) 
        return ""; //string agar khali h toh return ho jao

        //outer loop-1st word ke char pe loop chalega
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);//-current char store karo

       //compare ke liye with rest of string --inner loop
            for (int j = 1; j < strs.length; j++) {
             //isme index wise compare krte h with 2 conditions
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                //agar (fl) mil gya--means common prefix kaha tak h
                    return strs[0].substring(0, i);
                }
            }
        }
//return hojao jaha se  common nhi h
        return strs[0];
    }

    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(input);
        System.out.println("Longest Common Prefix: " + result);
    }
}



