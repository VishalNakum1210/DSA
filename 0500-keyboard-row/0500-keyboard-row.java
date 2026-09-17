import java.util.Arrays;

class Solution {
    public String[] findWords(String[] words) {
        int[] check = {2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};
        String[] res = new String[words.length];
        int ind = 0;
        
        for (String s : words) {
            char firstChar = Character.toLowerCase(s.charAt(0));
            int targetRow = check[firstChar - 'a'];
            boolean flag = true;
            for (int i = 1; i < s.length(); i++) {
                char ch = Character.toLowerCase(s.charAt(i));
                
                if (targetRow != check[ch - 'a']) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                res[ind++] = s;
            }
        }
       return Arrays.copyOfRange(res, 0, ind);
    }
}
