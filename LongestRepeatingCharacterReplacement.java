// Longest Repeating Character Replacement 

import java.util.*;

class Main {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        int left = 0;
        int maxFreq  = 0;
        int maxLength = 0;
        
        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(ch));
            
            while((right - left + 1) - maxFreq > k) {
                char charLeft = s.charAt(left);
                map.put(charLeft, map.get(charLeft) - 1);
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(maxLength);
    }
}