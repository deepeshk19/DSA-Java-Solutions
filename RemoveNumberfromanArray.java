// Remove Number from an array 
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        
        int slow = 0;
        
        for(int fast = 0; fast<arr.length; fast++) {
            if(arr[fast]!=3){
                arr[slow] = arr[fast];
                slow++;
            }
        }
        
        System.out.println("Count = " + slow);
        
        for(int i=0; i<slow; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}