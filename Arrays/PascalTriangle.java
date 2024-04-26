class Main{
    public static void printPascal(int n){
        for(int line=0;line<n;line++){
            for(int j=0;j<=line;j++)
                System.out.print(binomialCofficient(line,j)+" ");
            System.out.println();
        }
    }
    public static int binomialCofficient(int n,int k){
        int res = 1;
        if(k>n-k){
            k = n-k;
        }
        for(int i=0;i<k;i++){
            res*=(n-i);
            res/=(i+1);
        }
        return res;
    }
    public static void main(String[] args){
        int n = 6;
        printPascal(n);
    }
}