// Group Anagrams
import java.util.*;

class Main {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(String str : strs) {
            char[] ch = str.toCharArray();
            
            Arrays.sort(ch);
            
            String key = new String(ch);
            
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        System.out.println(new ArrayList<>(map.values()));
    }
}