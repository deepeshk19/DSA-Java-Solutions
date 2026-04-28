// Palindrome LinkedList

class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> result = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            result.add(temp.val);
            temp = temp.next;
        }

        int left = 0, right = result.size() - 1;

        while(left < right) {
            if(!result.get(left).equals(result.get(right))) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}