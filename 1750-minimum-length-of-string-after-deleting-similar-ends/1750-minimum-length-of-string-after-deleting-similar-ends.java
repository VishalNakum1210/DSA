class Solution {
    public int minimumLength(String s) {
        // StringBuilder sb = new StringBuilder();
        // char pre = 
        // for(int i = 0; i < s.length(); i++){
        //     if(pre == s.)
        // }
        int i = 0;
        int j = s.length() - 1;
        while (i < j && s.charAt(i) == s.charAt(j)) {
                while (i < j && s.charAt(i) == s.charAt(i + 1)) {
                    i++;
                }
                i++;
                while (i < j && s.charAt(j) == s.charAt(j - 1)) {
                    j--;
                }
                j--;
        }
        return (j-i+1 == -1) ? 0 : j-i+1;
    }
}