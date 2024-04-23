import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("Positive Number");
        }
        else if(n<0){
            System.out.println("Negative Number");
            if(n%2==0){
                System.out.println("Even Number");
            }
            else{
                System.out.println("Odd Number");
            }
        }
        else{
            System.out.println("Zero");
        }
    }
}