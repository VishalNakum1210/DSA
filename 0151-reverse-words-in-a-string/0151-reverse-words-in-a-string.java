class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1;
        while(end >= 0){
            while (end >= 0 && s.charAt(end) == ' ') {
                end--;
            }
            int start = end - 1;
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }
            
            if(start+1 == 0 && s.charAt(start+1) != ' '){
                sb.append(s.substring(start + 1, end + 1));
            }
            else if(start >= 0 && end >= 0){
                sb.append(s.substring(start + 1, end + 1) + " ");
            }
            end = start - 1;

        }
        if(sb.charAt(sb.length() - 1) == ' '){
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}