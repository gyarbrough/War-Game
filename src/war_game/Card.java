package war_game;

//Question 1a. Create Card class.
public class Card {

	//i. Define value and name fields for Card.
	private int value;
	private String name;
	
	//ii. Define card methods.
	//1. getters and setters
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//2. describe method for printing card info
	public String describe() {
		return name;
	}
			
	//Constructor used to build Deck.                                          
	public Card(int value, int suit) {
		this.value = value;
		switch(value) {
		case 2:
			switch(suit) {
			case 1:
				name = "Two of Spades";
				break;
			case 2:
				name = "Two of Clubs";
				break;
			case 3:
				name = "Two of Diamonds";;
				break;
			case 4:
				name = "Two of Hearts";;
				break;
			}
			break;
			
		case 3:
			switch(suit) {
			case 1:
				name = "Three of Spades";
				break;
			case 2:
				name = "Three of Clubs";
				break;
			case 3:
				name = "Three of Diamonds";;
				break;
			case 4:
				name = "Three of Hearts";;
				break;
			}
			break;
			
		case 4:
			switch(suit) {
			case 1:
				name = "Four of Spades";
				break;
			case 2:
				name = "Four of Clubs";
				break;
			case 3:
				name = "Four of Diamonds";;
				break;
			case 4:
				name = "Four of Hearts";;
				break;
			}
			break;
			
		case 5:
			switch(suit) {
			case 1:
				name = "Five of Spades";
				break;
			case 2:
				name = "Five of Clubs";
				break;
			case 3:
				name = "Five of Diamonds";;
				break;
			case 4:
				name = "Five of Hearts";;
				break;
			}
			break;
			
		case 6:
			switch(suit) {
			case 1:
				name = "Six of Spades";
				break;
			case 2:
				name = "Six of Clubs";
				break;
			case 3:
				name = "Six of Diamonds";;
				break;
			case 4:
				name = "Six of Hearts";;
				break;
			}
			break;
			
		case 7:
			switch(suit) {
			case 1:
				name = "Seven of Spades";
				break;
			case 2:
				name = "Seven of Clubs";
				break;
			case 3:
				name = "Seven of Diamonds";;
				break;
			case 4:
				name = "Seven of Hearts";;
				break;
			}
			break;
			
		case 8:
			switch(suit) {
			case 1:
				name = "Eight of Spades";
				break;
			case 2:
				name = "Eight of Clubs";
				break;
			case 3:
				name = "Eight of Diamonds";;
				break;
			case 4:
				name = "Eight of Hearts";;
				break;
			}
			break;
			
		case 9:
			switch(suit) {
			case 1:
				name = "Nine of Spades";
				break;
			case 2:
				name = "Nine of Clubs";
				break;
			case 3:
				name = "Nine of Diamonds";;
				break;
			case 4:
				name = "Nine of Hearts";;
				break;
			}
			break;
			
		case 10:
			switch(suit) {
			case 1:
				name = "Ten of Spades";
				break;
			case 2:
				name = "Ten of Clubs";
				break;
			case 3:
				name = "Ten of Diamonds";;
				break;
			case 4:
				name = "Ten of Hearts";;
				break;
			}
			break;
			
		case 11:
			switch(suit) {
			case 1:
				name = "Jack of Spades";
				break;
			case 2:
				name = "Jack of Clubs";
				break;
			case 3:
				name = "Jack of Diamonds";;
				break;
			case 4:
				name = "Jack of Hearts";;
				break;
			}
			break;
			
		case 12:
			switch(suit) {
			case 1:
				name = "Queen of Spades";
				break;
			case 2:
				name = "Queen of Clubs";
				break;
			case 3:
				name = "Queen of Diamonds";;
				break;
			case 4:
				name = "Queen of Hearts";;
				break;
			}
			break;
			
		case 13:
			switch(suit) {
			case 1:
				name = "King of Spades";
				break;
			case 2:
				name = "King of Clubs";
				break;
			case 3:
				name = "King of Diamonds";;
				break;
			case 4:
				name = "King of Hearts";;
				break;
			}
			break;
			
		case 14:
			switch(suit) {
			case 1:
				name = "Ace of Spades";
				break;
			case 2:
				name = "Ace of Clubs";
				break;
			case 3:
				name = "Ace of Diamonds";;
				break;
			case 4:
				name = "Ace of Hearts";;
				break;
			}
			break;
		}
		
		
	}
}
