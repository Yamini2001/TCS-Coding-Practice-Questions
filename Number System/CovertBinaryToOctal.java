import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.next();
        int n = s.length();
        if(n%3==1){
            s = "00" +s;
        }
        else if(n%3==2){
            s = "0" +s;
        }
        n = s.length();
        String ans = " ";
        for(int i=0;i<n;i+=3){
            int temp = (s.charAt(i)- '0')*4 + (s.charAt(i+1) - '0') *2 + (s.charAt(i+2)-'0')*1;
            ans = ans+ Integer.toString(temp);
        }
        System.out.println(ans);
    }
}
