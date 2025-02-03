class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length-1;
        while(start < end){
            int total = numbers[start] + numbers[end];
            if(total == target){
                return new int[]{start+1, end+1};
            }
            else if(total > target){
                end--;
            }
            else{
                start++;
            }
        }
        return new int[]{-1, -1};
    }
}
