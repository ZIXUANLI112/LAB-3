import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        // Initialize the scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Define the suits and ranks of a standard deck of cards
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // Prompt the user to input a card number
        System.out.print("Enter Card Number (1-52): ");
        int cardNumber = scanner.nextInt();

        // Validate the input to ensure it's within the range 1-52
        if (cardNumber < 1 || cardNumber > 52) {
            System.out.println("Invalid card number. Please enter a number between 1 and 52.");
        } else {
            // Calculate the suit and rank based on the input
            int suitIndex = (cardNumber - 1) / 13;
            int rankIndex = (cardNumber - 1) % 13;

            // Construct the card name using the calculated suit and rank
            String card = ranks[rankIndex] + " of " + suits[suitIndex];

            // Output the corresponding card to the user
            System.out.println("The card you picked is " + card);
        }

        // Close the scanner resource
        scanner.close();
    }
}
