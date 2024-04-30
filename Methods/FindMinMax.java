import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers from the user
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Call the methods to print the maximum and minimum numbers
        printMaximum(num1, num2, num3);
        printMinimum(num1, num2, num3);
    }

    // Method to print the maximum number among three numbers
    public static void printMaximum(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        System.out.println("Maximum number: " + max);
    }

    // Method to print the minimum number among three numbers
    public static void printMinimum(int a, int b, int c) {
        int min = Math.min(Math.min(a, b), c);
        System.out.println("Minimum number: " + min);
    }
}
