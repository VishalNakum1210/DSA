class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            int len = (strs[i].length() > prefix.length()) ? prefix.length() : strs[i].length();
            int j = 0;
            while(j < len && strs[i].charAt(j) == prefix.charAt(j)) j++;
            prefix = strs[i].substring(0, j);
        }

        return prefix;
    }
}