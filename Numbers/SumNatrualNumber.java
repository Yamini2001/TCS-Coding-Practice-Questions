import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = n * (n+1)/2;
        System.out.println("Sum of first natural numbers: "+sum);
    }
}