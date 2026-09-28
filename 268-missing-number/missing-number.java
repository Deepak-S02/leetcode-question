class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int a =(n*(n+1))/2;
        int sum = 0;
        for(int val:nums){
            sum = sum+val;
        }
        return a-sum;
        
    }
}