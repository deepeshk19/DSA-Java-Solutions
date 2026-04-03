// Binary Search to find the target element from the array

class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11};
        int target = 7;
        
        int result = binarySearch(arr, target);
        System.out.println(result);
        
    }
    
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while(left<=right) {
            int mid = left + (right - left)/2;
            
            if(target == arr[mid]) {
                return mid;
            } else if(arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}