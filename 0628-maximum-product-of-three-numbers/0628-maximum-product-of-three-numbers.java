class Solution {
    public int maximumProduct(int[] nums) {
        int len = nums.length-1;
        if(len != 2)
            marge(nums, 0, len);
        return Math.max(nums[len]*nums[len-1]*nums[len-2], nums[0]*nums[1]*nums[len]);
    }
    public void marge(int[] nums, int low, int high){
        if(low < high){
            int mid = (low + high) / 2;

            marge(nums, low, mid);
            marge(nums, mid+1, high);

            margeSort(nums, low, mid, high);
        }
    }

    public void margeSort(int[] nums, int low, int mid, int high){
        int i = low;
        int j = mid+1;
        int k = low;
        int[] temp = new int[nums.length];

        while(i <= mid && j <= high){
            if(nums[i] < nums[j]){
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

        for(int l = low; l <= high; l++)
            nums[l] = temp[l];
    }
}