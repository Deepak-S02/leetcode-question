class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       int n=arr.length,ans=0;
       for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
        int size= j-i+1;
        if(size%2!=0){
            int k=i;
            while(k<=j){
            ans+=arr[k];
            k++;
            }
        }
        }
    } 
       return ans;
    }
}