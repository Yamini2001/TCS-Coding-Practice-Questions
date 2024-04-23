import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i=1;i<=n;i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
}