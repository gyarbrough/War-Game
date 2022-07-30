package war_game;

import java.util.*;

//Question 1c. Create the Player class.
public class Player {

	//i. Declare variables associated to Player class.
	private List<Card> hand = new ArrayList<Card>();
	private String name;
	private int score;
	
	//ii. Declare methods associated to Player class.
	//1. Print out player name and cards in player's hand
	public void describe() {
		System.out.println(name + "'s Hand:");
		for (int i = 0; i < 26; i++) {
		  System.out.println(hand.get(i).describe());
		}
	}
	
	//2. Remove and return the top card in player's hand.
	public Card flip() {
		return hand.remove(0);
	}
	
	//3. Calls the draw method on the deck and adds Card to hand.
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	//4. Add 1 to player score.
	public void incrementScore() {
		setScore(getScore() + 1);
	}
	
	//Constructor
	public Player(String name) {
		this.setScore(0);
		this.name = name;
	}

	//getters and setters
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
