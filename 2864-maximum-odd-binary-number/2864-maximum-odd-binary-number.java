class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
                sb.append('1');
            }
        }
        if(count == 0){
            return s;
        }
        sb.deleteCharAt(count - 1);
        for(int i = count-1; i < s.length() -1; i++){
                sb.append('0');
        }
        sb.append('1');
        return sb.toString();
    }
}