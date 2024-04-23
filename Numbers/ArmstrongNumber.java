class Main{
    public static boolean ArmstrongNumber(int n){
        int originalNumber = n;
        int count = 0;
        int temp = n;
        while(temp!=0){
            count++;
            temp/=10;
        }
        int sum = 0;
        temp = n;
        while(temp!=0){
            int digit = temp%10;
            sum+=Math.pow(digit,count);
            temp/=10;
        }
        return (sum==originalNumber);
    }
    public static void main(String[] args){
        int n = 153;
        if(ArmstrongNumber(n)){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}