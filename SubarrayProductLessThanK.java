// Subarray Product Less Than K

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {10,5,2,6};
        int k = 100;
        
        int left = 0, count = 0;
        int product = 1;
        
        if (k <= 1) {
            System.out.println(0);
            return;
        }
        
        for(int right = 0; right < arr.length; right++) {
            product = product * arr[right];
            
            while (product >= k) {
                product = product / arr[left];
                left++;
            }
            
            count += (right - left + 1);
        }
        System.out.println(count);
    }
}