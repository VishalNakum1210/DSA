import java.util.ArrayList;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        boolean[] fre = new boolean[101];
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            fre[nums[i]] = true;
            min = Math.min(min, nums[i]);
        }

        for(int i = min; i < max; i++){
            if(!fre[i]){
                res.add(i);
            }
        }
        return res;
    }
}