class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> duplicate = new HashSet<>();
        for (int n : nums) {
            if (duplicate.contains(n)) {
                return true;
            }
            duplicate.add(n);
        }
        return false;
    }
}