import java.util.HashSet;

class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        
        for (int i = 0; i < n; i++) {
            HashSet<Integer> rowSet = new HashSet<>();
            HashSet<Integer> colSet = new HashSet<>();
            
            for (int j = 0; j < n; j++) {
                // If the add() method returns false, a duplicate exists in the row or col
                if (!rowSet.add(matrix[i][j]) || !colSet.add(matrix[j][i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
