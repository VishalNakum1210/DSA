class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] word = sentence.split(" ");
        for(int i = 0; i <word.length; i++){
            if(word[i].charAt(0) == 'a' || word[i].charAt(0) == 'e' || word[i].charAt(0) == 'i' || word[i].charAt(0) == 'o' || word[i].charAt(0) == 'u' || word[i].charAt(0) == 'A' || word[i].charAt(0) == 'E' || word[i].charAt(0) == 'I' || word[i].charAt(0) == 'O' || word[i].charAt(0) == 'U'){
                sb.append(word[i]);
            }else{
                sb.append(word[i].substring(1) + word[i].charAt(0));
            }
            sb.append("ma");
            for(int j = 0; j <= i; j++){
                sb.append("a");
            }
            if(i < word.length - 1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}