class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int pre = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int cur = getVal(s.charAt(i));

            if(pre > cur){
                sum -= cur;
            }else{
                sum += cur;
            }
            pre = cur;
        }
        return sum;
    }

    public int getVal(char ch) {
        switch (ch) {
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            case 'I':
                return 1;
            default:
                return 0;
        }
    }
}