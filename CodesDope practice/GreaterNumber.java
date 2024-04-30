import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the 4-digit number
        System.out.println("Enter a 4-digit number:");
        int number = scanner.nextInt();

        // Extract digits and add 2 to each
        int thousands = (number / 1000 + 2) % 10;
        int hundreds = ((number / 100) % 10 + 2) % 10;
        int tens = ((number / 10) % 10 + 2) % 10;
        int units = (number % 10 + 2) % 10;

        // Construct the new number
        int newNumber = thousands * 1000 + hundreds * 100 + tens * 10 + units;

        // Display the new number
        System.out.println("The displayed number is: " + newNumber);
    }
}
