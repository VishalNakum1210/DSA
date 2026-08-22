class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int pro = 1;
        int temp = n;
        while(temp > 0){
            sum += temp%10;
            pro *= temp%10;
            temp/=10;
        }

        if(n % (sum+pro) == 0){
            return true;
        }else{
            return false;
        }
    }
}