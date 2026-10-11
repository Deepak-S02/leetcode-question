class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int peak = 0;
        for(int i = 0 ; i<gain.length ; i++){
            
            peak += gain[i];
            if(peak > ans){
                ans = peak;
            }
        }
        return ans;
    }
}
        