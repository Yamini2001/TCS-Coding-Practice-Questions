import java.util.*;
class Main{
    public static List<Integer> findDuplicates(int[] arr){
        List<Integer> duplicates = new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            int index = Math.abs(arr[i])-1;
            if(arr[index]<0){
                duplicates.add(index+1);
            }
            else{
                arr[index] = -arr[index];
            }
        }
        return duplicates;
    }
    public static void main(String[] args){
        int[] arr= {5,3,1,6,2,7,2,3,7,9};
        List<Integer> duplicates = findDuplicates(arr);
        System.out.println(duplicates);

    }
}