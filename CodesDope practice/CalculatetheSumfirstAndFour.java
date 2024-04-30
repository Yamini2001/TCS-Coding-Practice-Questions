class Main{
    public static void main(String[] args){
        int n , first,second,third,fourth,fifth,sum;
        n = 34575;
        first = n/10000;
        n = n%10000;

        second = n/1000;
        n = n%1000;

        third = n/100;
        n = n%100;

        fourth = n/10;
        fifth = n%10;

        sum = first+fourth;
        System.out.println("Sum of first and fourth number: "+sum);

    }
}