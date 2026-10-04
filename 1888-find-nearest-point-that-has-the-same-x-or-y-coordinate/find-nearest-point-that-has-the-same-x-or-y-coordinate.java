class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int ans = -1;
        int smallest = 100000;

        for(int i =0; i<points.length;i++){
            int a = points[i][0];
            int b = points[i][1];

            if(a ==x || b == y){
                int dis = Math.abs(x-a) + Math.abs(y-b);

                if(dis <smallest){
                    smallest = dis;
                    ans = i;
                }
            }
            
        }
        return ans;
        
    }
}