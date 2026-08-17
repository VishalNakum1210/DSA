class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (i < command.length() - 1 && command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                sb.append("o");
                i++;
            }
            else{
                if(command.charAt(i) == '(' || command.charAt(i) == ')'){
                    continue;
                }else{
                    sb.append(command.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}