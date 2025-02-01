class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int num = 1;
        
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        
        while (num <= n * n) {
            for (int i = left; i <= right; i++) {
                ans[top][i] = num++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ans[i][right] = num++;
            }
            right--;  
            for (int i = right; i >= left; i--) {
                ans[bottom][i] = num++;
            }
            bottom--; 
            for (int i = bottom; i >= top; i--) {
                ans[i][left] = num++;
            }
            left++;
        }
        
        return ans;
    }
}