class Solution {
    public String toLowerCase(String s) {
        char[] array = s.toCharArray();
        for(int i=0; i<array.length; i++) {
            if(array[i] >= 'A' && array[i] <= 'Z') {
                array[i] = (char) (array[i] + 32);
            }
        }
        return new String (array);
    }
}