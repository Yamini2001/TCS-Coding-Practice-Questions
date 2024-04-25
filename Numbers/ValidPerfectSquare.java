class Main{
    public static boolean isValidPerfectSquare(int num){
        long left = 1;
        long right = num;
        while(left<=right){
            long mid = left+(right-left)/2;
            long square = mid* mid;
            if(square==num){
                return true;
            }
            else if(square>num){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int num=64;
        if(isValidPerfectSquare(num)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}