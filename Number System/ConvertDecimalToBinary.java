import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int[] binary = new int[32];
        int i=0;
        while(n>0){
            binary[i] = n%2;
            i++;
            n/=2;
        }
        for(int ind=i-1;ind>=0;ind--){
            System.out.println(binary[ind]);
        }
    }
}