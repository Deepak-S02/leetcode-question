class Solution {
    public int heightChecker(int[] heights) {
        int[] n = heights.clone();
        Arrays.sort(n);
        int count = 0;
        for(int i =0; i<n.length;i++){
            if(n[i] != heights[i]){
                count++;
            }
        }
        return count;

        

        
    }
}