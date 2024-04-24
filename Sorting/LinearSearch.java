import java.util.Scanner;

class Main{
    public static boolean linearSearch(int[] arr,int key){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={34,89,21,48,17,28};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        if(linearSearch(arr,key)){
            System.out.println("Key is present in an array");
        }
        else{
            System.out.println("Key is not present in an array");
        }

    }
}