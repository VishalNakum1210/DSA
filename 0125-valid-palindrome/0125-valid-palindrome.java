class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if('A' <= a && a <= 'Z'){
                a = (char) (a + 32);
            }
            if('A' <= b  && b <= 'Z'){
                b = (char) (b + 32);
            }

            if(!('a' <= a && a <= 'z') && !('0' <= a && a <= '9')){
                i++;
                continue;
            }
            if(!('a' <= b && b <= 'z') && !('0' <= b && b <= '9')){
                j--;
                continue;
            }

            if(a != b){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}