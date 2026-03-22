// lots of new things - how to syntax the thinking is the problem...

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i : nums) {            
            if (!numMap.containsKey(i)) {                
                numMap.put(i, 1);
            } else {
              numMap.put(i, numMap.get(i) + 1);  
            }
        }
        List<Map.Entry<Integer, Integer>> mapEntryList = new ArrayList<>(numMap.entrySet());
        Collections.sort(mapEntryList, (a, b) -> b.getValue() - a.getValue());

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(mapEntryList.get(i).getKey());
        }
        return result.stream().mapToInt(i -> i).toArray();    
    }
}
