// Reverse Words in a String

class Main {
    public static void main(String[] args) {
        String s = "  hello   world  ";
        
        s = s.trim();
        String[] words = s.split("\\s+");
        String newString = "";
        
        for(int i = words.length - 1; i>=0; i--) {
            newString = newString + words[i] + " ";
        }
        
        System.out.println(newString.trim());
    }
}