import java.util.HashMap;
public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t){

        if(s.length() != t.length())
            return false;
        HashMap<Character,Character> mapS1 = new HashMap<>();
        HashMap<Character,Character> mapS2 = new HashMap<>();

        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);
            char ph = t.charAt(i);

            if(mapS1.containsKey(ch)){
                if(mapS1.get(ch) != ph)
                    return false;
            }else{
                mapS1.put(ch,ph);

                        }
            if(mapS2.containsKey(ph)){
                if(mapS2.get(ph) != ch)
                    return false;
            }else{
                mapS2.put(ph, ch);
            }
        }
        return true;
    }
    public static void main(String args[]){

        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("foo","bar"));
    }
}
