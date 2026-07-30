class Solution {
    public int arraySign(int[] nums) {
        boolean minAns = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) return 0;
            if(nums[i] < 0) minAns = !minAns;
        }
        return (minAns) ? -1 : 1;
    }
}