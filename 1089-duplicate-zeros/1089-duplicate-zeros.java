class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                int j = n-2;
                while(j >= i){
                    arr[j+1] = arr[j];
                    j--;
                }
                i++;
            }
        }
    }
}