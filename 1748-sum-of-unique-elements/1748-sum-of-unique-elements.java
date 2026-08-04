import java.util.HashMap;
class Solution {
    public int sumOfUnique(int[] nums) {
        // HashMap<Integer, Integer> hm = new HashMap<>();

        // for(int i = 0; i < nums.length; i++){
        //     if(hm.containsKey(nums[i]))
        //         hm.put(nums[i], hm.get(nums[i])+1);
        //     else
        //         hm.put(nums[i], 1);
        // }        
        // int sum = 0; 
        // for(Map.Entry<Integer, Integer> val : hm.entrySet()){
        //     if(val.getValue() == 1)
        //         sum += val.getKey();
        // }
        // return sum;

        int[] fre = new int[101];
        for(int i : nums){
            fre[i]++;
        }
        int sum = 0;
        for(int i = 0; i < 101; i++){
            if(fre[i] == 1) sum += i;
        }
        return sum;
    }
}