import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] filteredNums = Arrays.stream(nums).filter(n -> n > 0).toArray();

        Arrays.sort(filteredNums);

        int target = 1;
        for(int num: filteredNums){
            if(num == target) target++;
            else if(num > target) return target;
        }
        return target;
    }
}