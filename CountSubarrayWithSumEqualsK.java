// Count Subarrays with Sum = K

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k = 2;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int prefixSum = 0, count = 0;
        
        map.put(0, 1);
        
        for(int i = 0; i < arr.length; i++) {
            prefixSum = prefixSum + arr[i];
            
            if(map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }
            
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        System.out.println(count);
    }
}