class Main{
    public static String removeVowels(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                str = str.substring(0,i)+ str.substring(i+1);
                i--;
            }
        }
        return str;
    }
    public static void main(String[] args){
        String str = "Move Forward";
        System.out.println("Remove the vowels of the string: "+removeVowels); 
    }

}