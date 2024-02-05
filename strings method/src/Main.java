import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creates a new scan to get an input from the user
        boolean bol = true; // Creates a new boolean for the while loop
        System.out.println("Enter Decimal to convert to ASCII: "); // Will ask the user to enter decimal numbers to convert to ascii
        while (bol == true) {
            int nextline = scan.nextInt(); // creates a variable that will go to the next value once looped
            System.out.print((char) (nextline)); // Will print out the number its on, as a letter.
            if (nextline == 10) {
                bol = false;
                // i wished i got farther but this is how far i got
            }
        }
    }
}