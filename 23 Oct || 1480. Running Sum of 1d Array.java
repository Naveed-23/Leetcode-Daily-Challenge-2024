class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            if(i == 0){
                ans[i] = nums[i];
                sum = nums[i];
            }else{
                ans[i] = sum + nums[i];
                sum += nums[i];
            }
        }
        return ans;
    }
}