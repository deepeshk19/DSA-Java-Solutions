// Two sum Using two pointers
import java.util.*;
class Main {
    
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        
        int[] result = new int[2];
        
        int left = 0, right = arr.length - 1;
        
        while(left < right) {
            int sum = arr[left] + arr[right];
            
            if(sum == target) {
                result[0]=left;
                result[1]=right;
                break;
            } else if(target < sum) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}