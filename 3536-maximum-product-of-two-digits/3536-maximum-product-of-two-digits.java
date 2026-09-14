class Solution {
    public int maxProduct(int n) {
        int max = 0, sec_max = 0;
        while(n > 0){
            int temp = n%10;
            if(temp >= max){
                sec_max = max;
                max = temp;
            }
            else if(sec_max < temp) sec_max = temp;
            n/=10;
        }

        return max*sec_max;
    }
}