class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            int width = right - left;
            int ht = Math.min(height[left], height[right]);
            int currWater = width * ht;
            maxWater = Math.max(maxWater, currWater);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }        
}