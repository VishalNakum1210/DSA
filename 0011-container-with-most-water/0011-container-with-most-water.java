class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int sum = 0;
        while(i < j){
            int w = j - i;
            int h = Math.min(height[i],height[j]);
             sum = Math.max(w*h,sum);
            if(height[i] > height[j]){
                j--;
            }
           else{
                i++;
           }
        }
        return sum;
    }
}