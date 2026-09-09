class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int SecMax = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                SecMax = max;
                max = nums[i];
            }
            else if(SecMax < nums[i]) SecMax = nums[i];
        }
        return (max-1) * (SecMax-1); 
    }
}