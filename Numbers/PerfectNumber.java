class Main{
    public static boolean isPerfectNumber(int n){
        int divisorSum = 0;
        for(int i=1;i<=n-1;i++){
            if(n%i==0){
                divisorSum+=i;
            }
        }
        if(divisorSum==n){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int n = 28;
        if(isPerfectNumber(n)){
            System.out.println(n+" is a perfect number");
        }
        else{
            System.out.println(n+" is not a perfect number");
        }

    }
}