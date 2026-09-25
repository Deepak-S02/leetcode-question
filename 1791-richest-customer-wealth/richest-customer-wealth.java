class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n=accounts[0].length;
        int w,maxwel=0;
        for(int i=0;i<m;i++){
            w=0;
            for(int j=0;j<n;j++){
                w+=accounts[i][j];
            }
            maxwel=Math.max(maxwel,w);
        }
        return maxwel;
    }
}