import java.util.*;
public class ValidParanthese {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // for (int i = 0; i < s.length(); i++) {
        //     char c = s.charAt(i);/
        for (char c : s.toCharArray()) { //toCharArray())--String ko char array me convert karta hai
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{[()]}";
        System.out.println(isValid(input)); // true

        input = "{[(])}";
        System.out.println(isValid(input)); // false
    }
}
