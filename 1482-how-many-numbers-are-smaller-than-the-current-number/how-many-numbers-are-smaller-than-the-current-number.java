class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] c =new int[nums.length]; 

        for (int i=0;i<nums.length;i++){
            int count =0;
            int n = nums[i];

            for(int b=0; b<nums.length;b++){
                if(n > nums[b]){
                    count = count+1;
                }
                c[i] =count;
            }
        }
        
        return c;
                   
        
        }
        
    }
