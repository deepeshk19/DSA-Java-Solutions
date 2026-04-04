// Longest Subarray with Sum ≤ K 

class Main {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 7;

        int left = 0, maxLength = 0;
        int currSum = 0;
        
        for(int right = 0; right < arr.length; right++) {
            currSum += arr[right];
            
            while(currSum > k) {
                currSum -= arr[left];
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(maxLength);
    }
}