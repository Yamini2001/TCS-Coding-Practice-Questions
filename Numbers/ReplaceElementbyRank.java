import java.util.*;
class Main{
    public static void main(String[] args){
        int n = 6;
        int[] arr={45,32,14,65,29,56};
        for(int i=0;i<n;i++){
            Set<Integer> s = new Hashset<>();
            for(int j=0;j<n;j++){
                if(arr[j]>arr[i]){
                    s.add(arr[j]);
                }
            } 
            int rank = s.size() +1;
            System.out.println(rank+" ");
        }
    }
}