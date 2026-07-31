class Solution {
    public int minimumPushes(String word) {
        int[] counts = new int[26];
        int len = word.length();
        if(len <= 8) return len;
        for(int i = 0; i < len; i++){
            int index = word.charAt(i) - 'a';
            counts[index]++; 
        }

        marge(counts, 0, 25);
        int i = 0;
        int sum = 0;
        while(i <= 25 && counts[i] != 0){
            if(i < 8) sum += counts[i];
            else if(i < 16) sum += counts[i] * 2;
            else if(i < 24) sum += counts[i] * 3;
            else sum += counts[i] * 4;
            i++;
        }
        return sum;
    }

    public void marge(int[] counts, int low, int high){
        if(low < high){
            int mid = (low + high) / 2;
            marge(counts, low, mid);
            marge(counts, mid+1, high);

            marge_sort(counts, low, mid, high);
        }
    }

    public void marge_sort(int[] counts, int low, int mid, int high){
        int i = low;
        int j = mid+1;
        int k = low;
        int[] temp = new int[26];

        while(i <= mid && j <= high){
            if(counts[i] > counts[j])
                temp[k++] = counts[i++];
            else
                temp[k++] = counts[j++];
        }

        while(i <= mid)
            temp[k++] = counts[i++];
        while(j <= high)
            temp[k++] = counts[j++];

        for(i = low; i <= high; i++){
            counts[i] = temp[i];
        }
    }
}