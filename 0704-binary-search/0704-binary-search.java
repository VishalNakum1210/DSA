class Solution {
    public int search(int[] nums, int target) {
        return searchElement(nums, 0, nums.length - 1, target);
    }
    public int searchElement(int[] nums, int low, int high, int t){
        if(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == t){
                return mid;
            }

            if(nums[mid] > t){
                return searchElement(nums, low, mid-1, t);
            }else{
                return searchElement(nums, mid+1, high, t);
            }
        }
        return -1;
    }
}