// Longest Common prefix

class Main {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        
        String prefix = "";
        
        for(int i=0; i<strs[0].length(); i++) {
            char charLeft = strs[0].charAt(i);
            
            for(int j=1; j<strs.length; j++) {
                if(i>=strs[j].length() || strs[j].charAt(i) != charLeft) {
                    System.out.println(prefix);
                    return;
                }
            }
            prefix += charLeft;
        }
        System.out.println(prefix);
    }
}