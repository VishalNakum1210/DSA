class Solution {
    public void sortColors(int[] nums) {
        int zeroCount = 0;
        int oneCount = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroCount++;
            }
            else if(nums[i] == 1){
                oneCount++;
            }
        }

        int i = 0;
        while(i < nums.length){
            if(zeroCount-- >= 1){
                nums[i] = 0;
            }
            else if(oneCount-- >= 1){
                nums[i] = 1;
            }
            else{
                nums[i] = 2;
            }
            i++;
        }
    }
}