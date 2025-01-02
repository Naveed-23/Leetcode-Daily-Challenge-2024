class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = Integer.MIN_VALUE;
        int suff = 1, pref = 1;
        for(int i=0; i<nums.length; i++){
            if(pref == 0) pref = 1;
            if(suff == 0) suff = 1;

            pref = pref * nums[i];
            suff = suff * nums[nums.length - i - 1];
            maxProd = Math.max(maxProd, Math.max(pref, suff));
        }
        return maxProd;
    }
}