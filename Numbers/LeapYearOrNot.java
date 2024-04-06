import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if(isLeapYear(year)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
    public static boolean isLeapYear(int year){
        if(year%4==0){
            if(year%100==0){
                return year%400==0;
            }else{
                return true;
            }
        }
        return false;
    }
}