package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;
// final commit
public class CardTrick {
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); // 1-13
            c.setSuit(Card.SUITS[rand.nextInt(4)]); // Random suit
            magicHand[i] = c;
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter card value (1-13): ");
        int userValue = input.nextInt();
        input.nextLine(); // consume leftover newline

        System.out.print("Enter card suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = input.nextLine();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        boolean found = false;
        for (Card c : magicHand) {
            if (c.getValue() == userCard.getValue() &&
                c.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Your card is in the magic hand! 🎉");
        } else {
            System.out.println("Your card is NOT in the magic hand. ❌");
        }

        System.out.println("\nMagic Hand:");
        for (Card c : magicHand) {
            System.out.println(c.getValue() + " of " + c.getSuit());
        }

        input.close();
    }
}

