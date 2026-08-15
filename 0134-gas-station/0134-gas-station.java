class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0, total = 0, start = 0;
        for(int i = 0; i < gas.length; i++){
            int get = gas[i] - cost[i];
            total += get;
            tank += get;

            if(tank < 0){
                start = i+1;
                tank = 0;
            }
        }

        if(total < 0){
            return -1;
        }
        return start;
    }
}