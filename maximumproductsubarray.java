// maximum product subarray

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        
        int maxProduct =  arr[0];
        int minProduct = arr[0];
        int result = arr[0];
        
        for(int i=1; i<arr.length; i++) {
            
            if(arr[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            
            maxProduct = Math.max(arr[i], minProduct * arr[i]);
            minProduct = Math.min(arr[i], maxProduct * arr[i]);
            
            result = Math.max(result, maxProduct);
        }
        
        System.out.println(result);
    }
}