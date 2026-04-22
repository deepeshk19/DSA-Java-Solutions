// Search Insert Position

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2;
        
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if(target == arr[mid]) {
                System.out.println(mid);
                return;
            } else if(arr[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);
    }
}