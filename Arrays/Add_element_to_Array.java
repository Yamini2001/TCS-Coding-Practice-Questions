import java.util.*;
class Main{
    public static int[] addElement(int[] arr,int n,int x){
        int[] arr1 = new int[n+1];
        for(int i=0;i<n;i++)
            arr1[i] = arr[i];
        arr1[n] = x;
        return arr1;
    }
    public static void main(String[] args){
        int[] arr={34,2,5,12,7,8,10,17,50,46};
        System.out.println("Initial Array:\n"
                + Arrays.toString(arr));
        int n = 10;
        int x = 56;
        arr = addElement(arr,n,x);
        System.out.println("Array with added: "+Arrays.toString(arr));


    }

}
