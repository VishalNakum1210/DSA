class Solution {
    public long repairCars(int[] ranks, int cars) {
        long low = 1;
        long high = 0;
        long res = 0;
        for(int i : ranks){
            high = Math.max(high, i);
        }
        high *= (long) cars*cars;
        while(low <= high){
            long mid = low + (high - low) / 2;
            long ans = 0;
            for(int i : ranks){
                ans += (long) Math.sqrt(mid/i);
            }
            if(ans >= cars){
                high = mid - 1;
                res = mid;
            }else{
                low = mid + 1;
            }
        }
        return res;
    }
}