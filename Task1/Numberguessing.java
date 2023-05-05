
import java.util.Scanner;

public class Numberguessing {
    
    // Main method that starts the game
    public static void main(String[] args) {
        System.out.println("Let's play a game. I'll pick a number between");
        System.out.println("1 and 100, and you try to guess it.");
        
        // Create a new Scanner object to read user input
        Scanner sc1 = new Scanner(System.in); 
        
        boolean playAgain;
        
        // Loop to allow the user to play the game multiple times
        do {
            // Call the playGame() method to play one game
            playGame();  
            
            // Ask the user if they want to play again
            System.out.println("Would you like to play again? Y/N");
            
            // Read the user's input as a string and convert it to a boolean value
            String playAgainStr = sc1.next();
            playAgain = playAgainStr.equalsIgnoreCase("Y");
        } while (playAgain);
        
        // Exit message
        System.out.println("Thanks for playing. Goodbye.");
    }
    
    // Method to play one game of number guessing
    static void playGame() {
        int computersNumber; // The number the computer has chosen
        int usersGuess;      // The user's current guess
        int guessCount;      // The number of guesses the user has made
        
        // Choose a random number between 1 and 100
        computersNumber = (int)(100 * Math.random()) + 1;
        
        // Initialize the guess count to 0
        guessCount = 0;
        
        System.out.println();
        System.out.println("What is your first guess?");
        
        // Create a new Scanner object to read user input
        Scanner sc= new Scanner(System.in);   
        
        // Loop until the user correctly guesses the number or reaches the maximum number of guesses
        while (true) {
            usersGuess = sc.nextInt(); // Read the user's guess
            
            // Increment the guess count
            guessCount++;
            
            // If the user guesses correctly, print a message and exit the loop
            if (usersGuess == computersNumber) {
                System.out.println("You got it in " + guessCount + " guesses! My number was " + computersNumber);
                break;  
            }
            
            // If the user has made too many guesses, print a message and exit the loop
            if (guessCount == 6) {
                System.out.println("You didn't get the number in 6 guesses.");
                System.out.println("You lose. My number was " + computersNumber);
                break;  
            }
            
            // If the user's guess is too low, prompt them to guess again and provide a hint
            if (usersGuess < computersNumber) {
                System.out.println("Your number is too low. Try again:");
            }
            
            // If the user's guess is too high, prompt them to guess again and provide a hint
            else if (usersGuess > computersNumber) {
                System.out.println("Your number is too high. Try again:");
            }
        }
        
        System.out.println();
    } 
}


