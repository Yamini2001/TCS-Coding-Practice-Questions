import java.util.Scanner;

class Main{
    public static int FibonacciNumber(int n){
       if(n<=1){
           return 0;
       }
       int[] fib= new int[n+1];
       fib[0] = 1;
       fib[1] = 1;
        for(int i=2;i<=n;i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Numbers are:");
        for (int i = 0; i < n; i++) {
            System.out.print(FibonacciNumber(i) + " ");
        }
    }
}