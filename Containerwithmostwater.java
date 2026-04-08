// Container with most water
import java.util.*;
class Main {
    
    public static void main(String[] args) {
        int[] Height = {1,8,6,2,5,4,8,3,7};
        int maxArea = 0;
        
        int left = 0, right = Height.length - 1;
        while(left < right) {
            int area = Math.min(Height[left], Height[right]) * (right - left);
        
            maxArea = Math.max(maxArea, area);
        
            if(Height[left] < Height[right]) {
                left++;
            } else {
                right--;
            }
            
            
        }
        System.out.println(maxArea);
    }
}