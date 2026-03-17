class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> checkedValues = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (checkedValues.containsKey(diff)) {
                return new int[] { checkedValues.get(diff), i };
            }
            checkedValues.put(nums[i], i);
        }
        return null;
    }
} 
