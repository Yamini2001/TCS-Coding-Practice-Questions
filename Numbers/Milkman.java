class Main{
public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        
        // Input the radius and height of the bottle
        int r = sc.nextInt(); // Radius in cm
        int h = sc.nextInt(); // Height in cm
        
        // Calculate the volume of the cylinder
        double volume = Math.PI * r * r * h;
        
        // Convert volume to liters (1 liter = 1000 cm³)
        double volumeInLiters = volume / 1000.0;
        
        // Calculate the amount to pay (rate = ₹40 per liter)
        double amountToPay = volumeInLiters * 40.0;
		double epsilon = 0.014;
        
        // Round the amount to two decimal places using Math.floor
        double roundedAmount = Math.floor((amountToPay - epsilon) * 100) / 100;
        
        // Output the rounded amount
        System.out.println(roundedAmount);
	}
}