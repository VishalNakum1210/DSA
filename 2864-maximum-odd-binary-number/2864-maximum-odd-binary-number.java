class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length() -1;

        while(i < j && arr[j] != '1'){
            if(arr[i] == '1'){
                arr[i] = '0';
                arr[j] = '1';
                break;
            }
            i++;
        }
        i = 0;
        j = s.length() - 2;
        while(i < j){
            if(arr[i] != '0'){
                i++;
            }
            if(arr[j] != '1'){
                j--;
            }
            if(i < j && arr[i] == '0' && arr[j] == '1'){
                arr[i] = '1';
                arr[j] = '0';
                i++;
                j--;
            }
        }
        return String.valueOf(arr);
    }
}