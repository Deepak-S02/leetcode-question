class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] c = new int[(n)*2];
         for(int i =0; i<n;i++){
            c[i] = nums[i];
            c[i+n] = nums[i];
         }
        return c; 
        
    }
}