import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double x = sc.nextDouble();
        System.out.println("Double: "+x);
        int y = sc.nextInt();
        System.out.println("Integer: "+y);
        char z = (char) sc.nextShort();
        System.out.println("Character: "+z);
    }
}