class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        boolean first = false;
        for(int i = 1; i < word.length(); i++){
            if('A' <= word.charAt(i) && word.charAt(i) <= 'Z'){
                if(!('A' <= word.charAt(i-1) && word.charAt(i-1) <= 'Z')){
                    return false;
                }
            }
            else if(i != 1 && 'a' <= word.charAt(i) && word.charAt(i) <= 'z'){
                if('A' <= word.charAt(i-1) && word.charAt(i-1) <= 'Z'){
                    return false;
                }
            }
        }
        return true;
    }
}