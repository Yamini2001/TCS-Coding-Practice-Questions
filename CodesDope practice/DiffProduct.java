import java.util.Scanner;

class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the number b: ");
        int b = sc.nextInt();
        int difference = a-b;
        System.out.println("Sum: "+difference);
        int product = a*b;
        System.out.println("Product: "+product);

    }
}