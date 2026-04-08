// Palindrom Check for string Using two pointers
class Main {
    public static void main(String[] args) {
        String s ="madam";
        
        boolean result = true;
        
        int left = 0, right = s.length() - 1;
        
        while(left <= right) {
            if(s.charAt(left)!=s.charAt(right)) {
                result = false;
            }
            left++;
            right--;
        }
        
        System.out.println(result);
    }
}