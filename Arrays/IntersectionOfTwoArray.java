import java.util.*;
class Main{
    public static Set<Integer> IntersectionArray(int[] arr1,int n,int m,int[] arr2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i=0;i<n;i++){
            set1.add(arr1[i]);
        }
        for(int j=0;j<m;j++){
            set2.add(arr2[j]);
        }
        set1.retainAll(set2);
        System.out.println("Intersection of the array: ");
        return set1;
    }
    public static void main(String[] args){
        int[] arr1 = {4,9,1,3,7,2,10,9};
        int[] arr2 = {4,10,9};
        int n = arr1.length;
        int m = arr2.length;
        System.out.println(IntersectionArray(arr1,n,m,arr2));
    }
}