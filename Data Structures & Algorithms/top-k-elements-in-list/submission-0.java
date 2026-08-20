class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // map.get() -> return value of that key if key not found return null
        // map.getOrDefault((num,0) -> return value if key not found return zero

        // count frequency of element
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[k];

        // Find k most frequent elements
        for (int i = 0; i < k; i++) {

            int maxFrequency = 0;
            int maxElement = 0;

            for (int num : map.keySet()) {

                if (map.get(num) > maxFrequency) {
                    maxFrequency = map.get(num);
                    maxElement = num;
                }
            }

            result[i] = maxElement;

            // Remove it so we don't select it again
            map.remove(maxElement);
        }

        return result;

    }
}
