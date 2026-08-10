class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        marge(nums, 0, nums.length - 1);
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > target) break;
            else if(nums[i] == target){
                res.add(i);
            }
        }
        return res;
    }
    public void marge(int[] nums, int low, int high){
        if(low < high){
            int mid = low + (high - low) / 2;
            marge(nums, low, mid);
            marge(nums, mid+1, high);

            margeSort(nums, low, mid, high);
        }
    }
    public void margeSort(int[] nums, int low, int mid, int high){
        int i = low, j = mid+1;
        int k = 0;
        int[] temp = new int[high - low + 1];
        while(i <= mid && j <= high){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }
            else{
                temp[k++] = nums[j++];
            }
        }
        while(i <= mid){
            temp[k++] = nums[i++];
        }
        while(j <= high){
            temp[k++] = nums[j++];
        }

        for(i = low; i <= high; i++){
            nums[i] = temp[i - low];
        }
    }
}