class Solution {
    public void duplicateZeros(int[] arr) {
        int[] temp = arr.clone();
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(temp[index] == 0){
                arr[i] = 0;
                if(i < arr.length-1)
                    arr[++i] = 0;
            }
            else{
                arr[i] = temp[index];
            }
            index++;
        }
    }
}