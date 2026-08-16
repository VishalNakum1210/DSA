class Solution {
    public String reverseOnlyLetters(String sb) {
        int i = 0;
        int j = sb.length() - 1;
        StringBuilder s = new StringBuilder(sb);
        while (i < j) {
            if (Character.isAlphabetic(s.charAt(i)) && Character.isAlphabetic(s.charAt(j))) {
                char temp = s.charAt(i);
                s.setCharAt(i, s.charAt(j));
                s.setCharAt(j, temp);
                j--;
                i++;
            }
            else{
                if(!Character.isAlphabetic(s.charAt(i))){
                    i++;
                }
                if(!Character.isAlphabetic(s.charAt(j))){
                    j--;
                }
            }
        }
        return s.toString();
    }
}