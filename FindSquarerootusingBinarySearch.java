// Find Square root using Binary Search

class Main {
    public static void main(String[] args) {
        int x = 28;
        int left = 1, right = x;
        double result = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long)mid * mid;
            
            if(square == x) {
                result = mid;
                break;
            } else if(square < x) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println(result);
        
    }
}