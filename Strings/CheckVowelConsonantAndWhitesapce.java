class Main{
    public static void solve(String str,int length){
        int vowels = 0, consonants = 0, whitespaces = 0;
        str = str.toLowerCase();
        for(int i=0;i<length;i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                vowels++;
            else if(ch >='a' && ch<='z')
                consonants++;
            else if(ch==' ')
                whitespaces++;
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
        System.out.println("Whitespaces: "+whitespaces);
    }
    public static void main(String[] args){
        String str = "Success requires work, not just words";
        int length = str.length();
        solve(str,length);

    }
}