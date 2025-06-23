import java.util.Scanner;

public class Week_7_Java_NumbersStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Number to String
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        input.nextLine(); // clear buffer
        String numStr = Integer.toString(number);
        System.out.println("Number to String: " + numStr);

        // String to Number
        System.out.print("Enter a numeric string: ");
        String strInput = input.nextLine();
        try {
            int strToNum = Integer.parseInt(strInput);
            System.out.println("String to Number: " + strToNum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }

        // Reverse a string
        System.out.print("Enter a string to reverse: ");
        String original = input.nextLine();
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed: " + reversed);

        // Math class demo
        System.out.print("Enter a number to find its square root: ");
        double value = input.nextDouble();
        System.out.println("Square root of " + value + ": " + Math.sqrt(value));
        System.out.println("Value of PI: " + Math.PI);

        // Character class demo
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        System.out.println("Is '" + ch + "' a digit? " + Character.isDigit(ch));
        System.out.println("Is '" + ch + "' a letter? " + Character.isLetter(ch));

        input.close();
    }
}
