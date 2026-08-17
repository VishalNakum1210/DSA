class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        for(String val : word1){
            sb.append(val);
        }
        int count = 0;
        for(String val : word2){
            for(int i = 0; i < val.length(); i++){
                if(count >= sb.length() || sb.charAt(count) != val.charAt(i)){
                    return false;
                }
                count++;
            }
        }
        if(count < sb.length()) return false;
        return true;
    }
}