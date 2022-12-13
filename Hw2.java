import java.util.*;

public class Hw2 {
    public static String Frequencusort(String s){
        Map<Character,Integer> freq=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (freq.containsKey(s.charAt(i))){
                freq.put(s.charAt(i),freq.get(s.charAt(i))+1);
            }else{
                freq.put(s.charAt(i),1);
            }
        }

        StringBuilder result= new StringBuilder();
        Set<Character> SetKeys = new HashSet<>(freq.keySet());
        while (!SetKeys.isEmpty()) {
            int max = 0;
            char maxch = 0;
            for (Character ch :SetKeys
            ) {
                if (max < freq.get(ch)) {
                    max = freq.get(ch);
                    maxch = ch;
                }
            }
            for (int i = 0; i < max; i++) {
                result.append(maxch);
            }
            SetKeys.remove(maxch);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(Frequencusort("tree"));
    }
}
