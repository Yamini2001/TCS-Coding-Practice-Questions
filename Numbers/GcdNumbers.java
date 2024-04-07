class Main{
    public static void main(String[] args){
        int num1 = 4,num2=8;
        int ans = 2;
        for(int i=1;i<=Math.min(num1,num2);i++){
            if(num1%i==0 && num2%i==0){
                ans = i;
            }
        }
        System.out.println("The GCD of two number is: "+ans);
    }
}