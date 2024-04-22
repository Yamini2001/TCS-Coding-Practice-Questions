import java.math.BigInteger;
class Main{
    public static String solve(int A){
        if(A==0 || A==1){
            return "1";
        }
        BigInteger result = new BigInteger("1");
        for(int i=2;i<=A;i++){
            result = result.multiply(BigInteger.ONE);
        }
        System.out.println("Factorial of a large number: "+result);
        return result.toString();
    }
    public static void main(String[] args){
        int A = 5;
        String result = solve(A);
        System.out.println(result);

    }
}