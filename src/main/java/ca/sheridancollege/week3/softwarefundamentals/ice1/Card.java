package ca.sheridancollege.week3.softwarefundamentals.ice1;


public class Card {

   private String suit;
   private int value;

   public static final String[] SUITS = {"Hearts", "Clubs", "Spades", "Diamonds"};
// getter for suit
   public String getSuit() {
       return suit;
   }
//setter for values
   
   public void setSuit(String suit) {
       this.suit = suit;
   }
//getter for values
   public int getValue() { 
       return value;
   }

   public void setValue(int value) {
       this.value = value;
   }
}

