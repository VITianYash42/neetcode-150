class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> group = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = String.valueOf(chars);
            
            if (!group.containsKey(sorted)) {
                group.put(sorted, new ArrayList<>());
            }
            group.get(sorted).add(s);
        }
        
        return new ArrayList<>(group.values());
    }
}