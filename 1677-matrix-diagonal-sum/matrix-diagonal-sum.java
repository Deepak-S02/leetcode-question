class Solution {
    public int diagonalSum(int[][] mat) {
        int start = 0;
        int end = mat.length-1;
        int sum = 0;
        for(int i = 0 ; i<mat.length;i++){
            if(start == end) sum-= mat[i][start];
            sum += mat[i][start] + mat[i][end];
            start++;
            end--;
        }
        return sum;  
        
            
        
    }
}