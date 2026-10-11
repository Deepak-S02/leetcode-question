class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2]; 
        for(int i =0 ; i<nums.length ; i++){
            int a = nums[i];
            int d = target - nums[i];
            for(int j=0 ; j<nums.length ;j++){
                if(d == nums[j] && i != j ){
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index; 
        
    }
}