// Count the number of Occurrences of target element

class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4};
        int target = 2;
        
        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);
        
        if(first == -1) {
            System.out.println(0);
        } else {
            System.out.println(last - first + 1);    
        }
        
    }
    
    public static int firstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        
        while(left<=right) {
            int mid = left + (right - left)/2;
            
            if(target == arr[mid]) {
                result = mid;
                right = mid - 1;
            } else if(arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
    
    public static int lastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        
        while(left<=right) {
            int mid = left + (right - left)/2;
            
            if(target == arr[mid]) {
                result = mid;
                left = mid + 1;
            } else if(arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}