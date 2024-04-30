import java.util.*;
class Main{
    public static Set<String> CommonCharacters(String str1,String str2,int n,int m){
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        for(int i=0;i<n;i++){
            set1.add(String.valueOf(str1.charAt(i)));
        }
        for(int j=0;j<m;j++){
            set2.add(String.valueOf(str2.charAt(j)));
        }
        set1.retainAll(set2);
        return set1;
    }
    public static void main(String[] args){
        String set1 = "geeks";
        String set2 = "forgeeks";
        int n = set1.length();
        int m = set2.length();
        System.out.println("Common Characters: "+CommonCharacters(set1,set2,n,m));
    }
}