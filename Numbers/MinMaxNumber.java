class Main{
    private static void MinMax(int n){
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        while(n!=0){
           int d = n%10;
           mini = Math.min(mini,d);
           maxi = Math.max(maxi,d);
           n/=10;
        }
        System.out.println("The minimum numbers is: "+mini);
        System.out.println("The maximum numbers is: "+maxi);
    }
    public static void main(String[] args){
        int n = 4312;
        MinMax(n);
    }
}