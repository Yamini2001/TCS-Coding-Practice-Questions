import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the divisor: ");
        int divisor = sc.nextInt();
        System.out.println("Enter the quotient: ");
        int quotient = sc.nextInt();
        System.out.println("Enter the remainder: ");
        int remainder = sc.nextInt();
        System.out.println("Enter the dividend: ");
        int dividend = sc.nextInt();
        divisor = dividend* quotient+remainder;
        System.out.println("output of this code: "+divisor);
        if(divisor>1){
            System.out.println("Natural Number");
        }
        else if(divisor<0){
            System.out.println("Not a natural number");
        }
    }
}