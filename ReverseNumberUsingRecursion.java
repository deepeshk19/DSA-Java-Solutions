// reverse a number using Recursion

class Main {
    static int result = 0;
    public static void reverse(int n) {
        if(n==0) {
            return;
        }
        
        int digit = n % 10;
        result = result * 10 + digit;
        
        reverse(n/10);
    }
    public static void main(String[] args) {
        int n = 1234;
        reverse(n);
        System.out.println(result);
    }
}