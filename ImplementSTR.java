public class ImplementSTR {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            int j;
            for (j = 0; j < needleLength; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needleLength) {
                return i; // Found the needle at index i
            }
        }

        return -1; // Needle not found
    }
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle)); // Output: 2

        haystack = "aaaaa";
        needle = "bba";
        System.out.println(strStr(haystack, needle)); // Output: -1

        haystack = "";
        needle = "";
        System.out.println(strStr(haystack, needle)); // Output: 0
    }
}
