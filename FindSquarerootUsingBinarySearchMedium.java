// Find Squareroot for the given number 

class Main {
    public static void main(String[] args) {
        int x = 50;

        int left = 1, right = x;
        int result = -1;
        
        while(left <= right) {
            int mid = left + (right - left)/2;
            long square = mid * mid;
            
            if(square == x) {
                result = mid;
            } else if(square <= x){
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(result);
    }
}