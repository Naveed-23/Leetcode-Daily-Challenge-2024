class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];  // Add current digit of num to k
                i--;
            }
            result.add(0, k % 10); // Get last digit
            k /= 10; // Remove last digit from k
        }
        return result;
    }
}