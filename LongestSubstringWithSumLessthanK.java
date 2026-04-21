// longest substring with sum < = k

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 10};
        int k = 14;
        
        int left = 0, sum = 0, maxSum = 0;
        
        for(int right = 0; right < arr.length; right++) {
            sum = sum + arr[right];
            
            while(sum > k) {
                sum = sum - arr[left];
                left++;
            }
            
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}