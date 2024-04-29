import java.util.Scanner;

class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the number b: ");
        int b = sc.nextInt();
        System.out.println("Enter the number c: ");
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("Sum: "+sum);

    }
}