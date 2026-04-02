// Maximum Sum Subarray of Size K 

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        
        int left = 0;
        int maxLength = 0;
        int maxSum = 0;
        int currSum = 0;
        
        for(int right = 0; right < arr.length; right++) {
            
            currSum += arr[right];
        
            if(right - left + 1 == k) {
                maxSum = Math.max(maxSum, currSum);
                
                currSum = currSum - arr[left];
                left++;
            }
        }
        System.out.println(maxSum);
    }
}