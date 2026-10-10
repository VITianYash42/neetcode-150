class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int m : nums) {
            if (map.containsKey(m)) {
                int current_freq = map.get(m);
                map.put(m, current_freq + 1);
            }
            else {
                map.put(m, 1);
            }
        }
        int len = nums.length;
        List<Map.Entry<Integer, Integer>> new_list = new ArrayList<>(map.entrySet());
        new_list.sort((a, b) -> b.getValue() - a.getValue());
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = new_list.get(i).getKey();
        }
        return result;   
    }
}
