class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> longest = new HashSet<>();
        for (int n : nums) {
            if (!longest.contains(n)) {
                longest.add(n);
            }
        }
        
        int max_count = 0;
        for (int x : longest) {
            if (!longest.contains(x-1)) {
                int sub_count = 1;
                while (longest.contains(x + sub_count)) {
                    sub_count += 1;
                }
                max_count = Math.max(max_count, sub_count);
            }
        }
        return max_count;
    }
}