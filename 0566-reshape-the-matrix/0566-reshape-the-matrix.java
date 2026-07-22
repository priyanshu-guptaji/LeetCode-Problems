class Solution { 
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int total = m * n;

        // If reshaping is impossible, return the original matrix
        if (r * c != total) { 
            return mat; 
        }

        int[][] res = new int[r][c];

        // Map the single-index counter to 2D coordinates
        for (int i = 0; i < total; i++) { 
            res[i / c][i % c] = mat[i / n][i % n]; 
        }

        return res; 
    }
}
