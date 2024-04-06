import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(Ssytem.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int a = 5;
        int d = 12;
        double sum = (n*(2*a+(n-1)*d))/2.0;
        System.out.println("Sum of an AP series: "+sum);
    }
}