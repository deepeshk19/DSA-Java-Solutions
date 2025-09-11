class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        int n = nums.length;

        for(int num: nums) {
            if(num !=0){
                nums[j] = num;
                j++;
            }
        }

        while(j < n) {
            nums[j] = 0;
            j++;
        }
    }
}