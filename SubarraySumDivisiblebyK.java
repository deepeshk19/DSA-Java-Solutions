// Subarray Sum Divisible by K

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,0,-2,-3,1};
        int k = 5;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int prefixSum = 0, count = 0;
        
        map.put(0, 1);
        
        for(int i = 0; i < arr.length; i++) {
            prefixSum = prefixSum + arr[i];
            int remainder = (prefixSum % k + k) % k;
            
            if(map.containsKey(remainder)) {
                count += map.get(remainder);
            }
            
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        System.out.println(count);
    }
}