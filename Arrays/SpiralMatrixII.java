class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int top = 0, bottom = n-1, left = 0, right = n-1;
        int num = 1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                result[top][i] = num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                result[i][right] = num++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    result[bottom][i] = num++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result[i][left] = num++;
                }
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args){
         int n = 5;
        int[][] result = generateMatrix(n);
        System.out.println("Generate Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}