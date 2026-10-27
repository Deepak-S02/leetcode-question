
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        int total = 0;
        int maxDiagonal = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int diag = i + j;

                map.putIfAbsent(diag, new ArrayList<>());
                map.get(diag).add(mat[i][j]);

                total++;
                maxDiagonal = Math.max(maxDiagonal, diag);
            }
        }

        int[] ans = new int[total];
        int idx = 0;

        for (int i = 0; i <= maxDiagonal; i++) {
            List<Integer> temp = map.get(i);

            if (i % 2 == 0) {
                for (int j = temp.size() - 1; j >= 0; j--) {
                    ans[idx++] = temp.get(j);
                }
            } else {
                for (int j = 0; j < temp.size(); j++) {
                    ans[idx++] = temp.get(j);
                }
            }
        }

        return ans;
    }
}

