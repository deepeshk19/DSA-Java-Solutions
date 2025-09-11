class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxlen = 0;
        int n = s.length();
        boolean[] visited = new boolean[256];

        while(right < n) {
            char ch = s.charAt(right);

            while(visited[ch]) {
                visited[s.charAt(left)] = false;
                left++;
            }

            visited[ch] = true;
            maxlen = Math.max(maxlen, right-left + 1);
            right++;
        }
        return maxlen;
    }
}