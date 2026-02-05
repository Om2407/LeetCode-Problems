public class StringCompression {

    public static String compressString(String str) {

        if (str == null || str.length() == 0) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            }

            // append when character changes OR when we reach last index
            if (str.charAt(i) != str.charAt(i - 1) || i == str.length() - 1) {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        String input = "aaabbbccdaa";
        System.out.println(compressString(input));
    }
}
