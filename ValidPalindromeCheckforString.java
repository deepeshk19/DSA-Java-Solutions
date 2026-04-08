// Valid Palindrom Check for string Using two pointers
class Main {
    public static boolean palindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left)!= s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s ="abcaba";
        
        int left = 0, right = s.length() - 1;
        
        while(left <= right) {
            if(s.charAt(left)!=s.charAt(right)) {
                boolean result = palindrome(s, left+1, right) || palindrome(s, left, right-1);
                System.out.println(result);
                return;
            }
            left++;
            right--;
        }
        
        System.out.println(true);
    }
}