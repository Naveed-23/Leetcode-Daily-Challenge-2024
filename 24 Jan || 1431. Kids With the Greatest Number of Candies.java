import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int i=0; i<candies.length; i++){
            max = Math.max(max, candies[i]);
        }
        for(int i=0; i<candies.length; i++){
            list.add(candies[i] + extraCandies >= max);
        }
        return list;
    }
}