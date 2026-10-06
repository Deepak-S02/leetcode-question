class Solution {
    public int maxProduct(int[] nums) {
        int product = 0;
        int max1 = 0;
        int max2 = 0;
        for(int i =0 ; i<nums.length;i++){ 
            int temp = nums[i];
                if( temp > max1){
                    max2 = max1;
                    max1 =temp;
                
                }
                else if(temp>max2){
                    max2 = temp;
                }
            }
            int a =max1;
            int d =max2;
            product = (a-1)*(d-1);
            return product;    
        
    }
}