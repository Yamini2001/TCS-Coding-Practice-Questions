import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the number b: ");
        int b = sc.nextInt();
        Sum(a,b);
    }
    public static void Sum(int a,int b){
        int sum = a+b;
        System.out.println("Sum of two number is: "+sum);
    }
}