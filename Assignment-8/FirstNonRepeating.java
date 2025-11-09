import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String s = "aabbcddeff";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        for(char c : map.keySet()) {
            if(map.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }
    }
}
