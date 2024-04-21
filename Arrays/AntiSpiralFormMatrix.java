import java.util.*;

class Main {
    public static void antiSpiral(int m, int n, int[][] matrix) {
        int top = 0, left = 0, i = 0;
        Stack<Integer> s = new Stack<>();
        while (top <= m && left <= n) {
            for (i = left; i <= n; i++) {
                s.push(matrix[top][i]);
            }
            top++;
            for (i = top; i <= m; i++) {
                s.push(matrix[i][n]);
            }
            n--; // Decrement n after traversing the last column
            if (top <= m) {
                for (i = n; i >= left; i--) {
                    s.push(matrix[m][i]);
                }
                m--; // Decrement m after traversing the last row
            }
            if (left <= n) {
                for (i = m; i >= top; i--) {
                    s.push(matrix[i][left]);
                }
                left++; // Increment left after traversing the first column
            }
        }
        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }

    public static void main(String[] args) {
        int mat[][] =
                {
                        {1,  2,  3,  4,  5},
                        {6,  7,  8,  9,  10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20}
                };

        antiSpiral(mat.length - 1, mat[0].length - 1,
                mat);
    }
}
