import java.util.Scanner; // Import the Scanner class from the java.util package

class Main { // Define the Main class
    public static void main(String[] args) { // The main method where the program execution begins
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console

        // Prompt the user for their name
        System.out.println("hey, whats your name? "); 

        // Read the user's input and store it in the variable 'name'
        String name = scanner.nextLine();

        // Output a greeting to the user
        System.out.println("Hello " + name);
    }
}
