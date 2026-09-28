/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int low = 0;
        int high = mountainArr.length() - 1;
        int peek = findPeek(low, high, mountainArr);
        if (mountainArr.get(peek) < target) {
            return -1;
        }
        int ans = bS(low, peek, target, mountainArr, true);
        if (ans != -1) {
            return ans;
        }
        
        return bS(peek + 1, high, target, mountainArr, false);
    }
    
    private int findPeek(int low, int high, MountainArray mountainArr) {
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    
    private int bS(int low, int high, int target, MountainArray mountainArr, boolean isAscending) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midVal = mountainArr.get(mid);

            if (midVal == target) {
                return mid;
            }
            
            if (isAscending) {
                if (midVal > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (midVal > target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
