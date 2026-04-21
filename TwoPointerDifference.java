// Two Pointer (Opposite)

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,10};
        int target = 2;
        
        int left = 0, right = arr.length - 1;
        int diff = 0;
        
        while(right < arr.length) {
            
            diff = arr[right] - arr[left];
            
            if(diff == target) {
                System.out.println(true);
                return;
            } else if( diff > target) {
                right-- ;
            } else {
                left++;
            }
            
            if(left == right) {
                right++;
            }
        }
        System.out.println(false);
    }
}