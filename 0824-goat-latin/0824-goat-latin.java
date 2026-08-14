class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {

            if (isVol(words[i].charAt(0))) {
                sb.append(words[i]);
            } else {
                sb.append(words[i].substring(1));
                sb.append(words[i].charAt(0));
            }

            sb.append("ma");

            for (int j = 0; j <= i; j++) {
                sb.append("a");
            }

            if (i < words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public boolean isVol(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}