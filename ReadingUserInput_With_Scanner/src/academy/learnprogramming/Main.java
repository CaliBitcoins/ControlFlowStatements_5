package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a new instance of the scanner class to read user input
        Scanner scanner = new Scanner(System.in);

        // Output instructions to user
        System.out.println("Enter your year of birth: ");

        // make sure input is an int
        boolean hasNextInt = scanner.hasNextInt();

        /// catch errors if YOB input was not an int
        if (hasNextInt) {
            // Use scanner to retrieve information from console and set value
            int birthYear = scanner.nextInt();
            scanner.nextLine(); // REQUIRED: USE THIS TO HANDLE USER HITTING ENTER KEY

            // Calculate user age
            int age = 2019 - birthYear;

            // Output instructions to user
            System.out.println("Enter your name: ");

            // Use scanner to retrieve information from console and set value
            String name = scanner.nextLine();

            // Check if input is within valid range
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth.");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }


        // Close scanner to free up memory
        scanner.close();
    }
}
