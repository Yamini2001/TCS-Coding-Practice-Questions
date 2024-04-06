import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int a = 5;
        int r = 12;
        double sum = (a*(Math.pow(r,n)-1))/(r-1);
        System.out.println("Sum of GP Series: "+sum);
    }
}