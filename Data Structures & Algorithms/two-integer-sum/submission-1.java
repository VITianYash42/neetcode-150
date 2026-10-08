class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sum = new HashMap<>();
        for (int i = 0; i<nums.length; i++) {
            int value_j = target - nums[i];
            if (sum.containsKey(value_j)) {
                return new int[] {sum.get(value_j), i};
            }
            sum.put(nums[i], i);
        }
        return new int[]{};
    }
}