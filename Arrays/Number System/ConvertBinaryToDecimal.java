import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.next();
        int n = s.length();
        int base = 1;
        int ans = 0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                ans+=base;
            }
            base*=2;
        }
        System.out.println(ans);
    }
}