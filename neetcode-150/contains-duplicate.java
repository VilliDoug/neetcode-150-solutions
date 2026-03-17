class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int num1 = 0;
        int num2 = 0;         
        for (int i = 0; i < nums.length - 1; i++) {
            num1 = nums[i];
            num2 = nums[i+1];
            if (num1 == num2) {
                return true;
            }
        }
        return false;
    }
}    
