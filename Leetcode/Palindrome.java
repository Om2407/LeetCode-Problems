public class Palindrome {
 public static boolean isPalindrome(String str){
    String reversed = new StringBuilder(str).reverse().toString();
    return str.equals(reversed);
 }
 public static void main(String args[]){
    // String str = "madam";
 
    System.out.println("Is the string a palindrome? " + isPalindrome("madam"));
    System.out.println("Is the string a palindrome? " + isPalindrome("hello"));
 }
}
