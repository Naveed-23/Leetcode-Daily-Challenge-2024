class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         int n = image.length;

        for (int[] row : image) {
            int left = 0, right = n - 1;
            
            while (left <= right) {
                // Swap and invert
                int temp = row[left] ^ 1;  // XOR with 1 to invert
                row[left] = row[right] ^ 1;
                row[right] = temp;

                left++;
                right--;
            }
        }
        return image;
    }
}
