class Solution {
    public String modifyString(String s) {
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '?'){
                char ch = 'a';
                if(s.length() == 1){
                    sb.setCharAt(i, ch);
                }
                else if(i == 0){
                    while(ch == sb.charAt(i+1)){
                        ch++;
                    }
                }else if(i == s.length()-1){
                    while(ch == sb.charAt(i-1)){
                        ch++;
                    }
                }else{
                    while(ch == sb.charAt(i+1) || ch == sb.charAt(i-1)){
                        ch++;
                    }
                }
                sb.setCharAt(i, ch);
            }
        }
        return sb.toString();
    }
}