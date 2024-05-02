import java.util.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int candies = sc.nextInt();
		int cousin = sc.nextInt();
		if(candies%cousin==0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
	}
}