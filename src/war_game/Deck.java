package war_game;

import java.util.*;

//Question 1b. Create Deck class.
public class Deck {

	//i. Declare list of Card named cards
	private List<Card> cards = new ArrayList<Card>();
	
	//ii. Declare Deck methods.
	
	//1. Method that shuffles the Deck.
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	//2. Method that draws and removes top card from Deck.
	public Card draw() {
		return cards.remove(0);
	}
	
	//3. Constructor that instantiates Deck and fills it with 52 cards.
	public Deck() {
		for (int value = 2; value <= 14; value++) {
			for (int suit = 1; suit <= 4; suit++) {
				Card card = new Card(value, suit);
				cards.add(card);
			}
		}
	}
}
