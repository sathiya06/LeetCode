class Solution {
    public int[][] onesMinusZeros(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] rowSum = new int[m];
        int[] colSum = new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 1){
                    rowSum[i]++;
                    colSum[j]++;
                }
            }
        }
        int[][] ans = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int onesRow = rowSum[i];
                int onesCol = colSum[j];
                ans[i][j] = onesRow + onesCol + (onesRow - m) + (onesCol - n);
            }
        }
        return ans;
    }
}