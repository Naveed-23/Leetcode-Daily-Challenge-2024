class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Fill the hashmap with the first occurrence of each number in sortedNums
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(sortedNums[i], i);
        }

        // Map original nums to their count of smaller numbers
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = map.get(nums[i]);
        }

        return result;
    }
}
