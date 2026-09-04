import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        marge(nums, 0, nums.length - 1);
        for (int a = 0; a < nums.length - 2; a++) {
            if (a > 0 && nums[a] == nums[a - 1])
                continue;
            int rem = -nums[a];
            int i = a + 1, j = nums.length - 1;

            while (i < j) {
                if ((nums[i] + nums[j]) == rem) {
                    res.add(Arrays.asList(nums[a], nums[i], nums[j]));
                    i++;
                    j--;

                    while (i < j && nums[i] == nums[i - 1]) {
                        i++;
                    }
                    while (i < j && nums[j] == nums[j + 1]) {
                        j--;
                    }
                } else if ((nums[i] + nums[j]) < rem)
                    i++;
                else
                    j--;
            }
        }
        return res;
    }

    public void marge(int[] nums, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            marge(nums, low, mid);
            marge(nums, mid + 1, high);
            margeSort(nums, low, mid, high);
        }
    }

    public void margeSort(int[] nums, int low, int mid, int high) {
        int i = low, j = mid + 1, k = 0;
        int[] temp = new int[high - low + 1];
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= high) {
            temp[k++] = nums[j++];
        }
        for (i = low; i <= high; i++) {
            nums[i] = temp[i - low];
        }
    }
}