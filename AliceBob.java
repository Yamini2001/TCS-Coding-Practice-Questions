import java.util.*;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==arr[0]){
                count++;
            }
            System.out.println(n-count);
        }
    }
}