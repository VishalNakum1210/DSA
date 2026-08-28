class Solution {
    public char findTheDifference(String s, String t) {
        int[] seen = new int[26];
        for(int i = 0; i < s.length(); i++){
            seen[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < t.length(); i++){
            seen[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(seen[i] != 0){
                return (char) (i+'a');
            }
        }
        return ' ';
    }
}