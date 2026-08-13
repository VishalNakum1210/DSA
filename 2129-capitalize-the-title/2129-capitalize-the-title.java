class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder s = new StringBuilder();
        String[] word = title.split(" ");
        // s.append(Character.toUpperCase(word[0].charAt(0)));
        // s.append(word[0].substring(1).toLowerCase());
        boolean first = true;
        for(String val : word){
            // if(first){
            //     first = false;
            //     continue;
            // }
            if(val.length() <= 2){
                s.append(val.toLowerCase());
                s.append(" ");
            }else{
                s.append(Character.toUpperCase(val.charAt(0)));
                s.append(val.substring(1).toLowerCase());
                s.append(" ");
            }
        }
        s.delete(title.length(), title.length()+1);
        return s.toString();
    }
}