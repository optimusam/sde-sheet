class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    public void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
    public void reverse(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int l=0, r=matrix.length-1;
            while(l < r) {
                int tmp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = tmp;
                l++;
                r--;
            }
        }
    }
}