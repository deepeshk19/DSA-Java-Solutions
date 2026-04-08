// Remove Duplicates from Array atmost twice 
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3};
        
        int slow = 2;
        
        for(int fast = 2; fast < arr.length; fast++) {
            if(arr[fast] != arr[slow-2]) {
                arr[slow] = arr[fast];
                slow++;
            }
        }
        
        System.out.println("Count="+slow);
        
        for(int i=0; i<slow; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}