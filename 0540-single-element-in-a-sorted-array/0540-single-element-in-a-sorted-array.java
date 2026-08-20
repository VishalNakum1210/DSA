class Solution {
    public int singleNonDuplicate(int[] nums) {
       int sum = 0;
       for(int val : nums){
        sum ^= val;
       } 
       return sum;
    }
}