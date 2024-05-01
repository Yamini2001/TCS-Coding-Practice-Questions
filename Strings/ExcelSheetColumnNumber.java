class Solution {
    public int titleToNumber(String columnTitle) {
        int result =0;
        for(int i=columnTitle.length()-1;i>=0;i--){
            char ch = columnTitle.charAt(i);
            int value = ch - 'A'+1;
            int positionValue = (int) Math.pow(26, columnTitle.length() - 1 - i);
            result += value * positionValue;
        }
        return result;
    }
}