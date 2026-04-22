// Find Minimum element in rotated array

class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int min = Integer.MAX_VALUE;
        
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[left] <= arr[right]) {
                min = Math.min(min, arr[left]);
                break;
            }
            
            if(arr[left] <= arr[mid]){
                min = Math.min(min, arr[left]);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            
        }
        System.out.println(min);
    }
}