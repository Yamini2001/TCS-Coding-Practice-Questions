import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        float sum = (float) (n * (n + 1)) /2;
        System.out.println("Sum of the natural numbers: "+sum);
    }
}