package war_game;

//Question 2. Create class named App
public class App {

	public static void main(String[] args) {
		
		//Question 3. Instantiate a Deck and two Players.
		Deck deck = new Deck();
		Player player1 = new Player("Garrett");
		Player player2 = new Player("War Machine");
		
		//Shuffle the Deck.
		deck.shuffle();
		
		//Question 4 Draw Player hands.
		for (int i = 0; i < 52; i++) {
			if (i < 26) {
				player1.draw(deck);
			} else if (i >= 26 && i < 52) {
				player2.draw(deck);
			}
		}
		
		//Show player hands
		System.out.println("**********************************************");
		System.out.println("*****************Player Hands*****************");
		System.out.println("**********************************************");
		player1.describe();
		System.out.println("**********************************************");
		player2.describe();
		
		//Question 5. Flip each player's hand.
		System.out.println("**********************************************");
		System.out.println("*******************Matchups*******************");
		System.out.println("**********************************************");
		for (int i = 0; i < 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
		    System.out.println(player1Card.getName() + " vs " + player2Card.getName());
			if (player1Card.getValue() < player2Card.getValue()) {
				player2.incrementScore();
			} else if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
			}
		}
		
		//Question 6 & 7 Compare final scores and print final scores and winner if there is one.
		System.out.println("**********************************************");
		System.out.println("****************Final Result******************");
		System.out.println("**********************************************");
		System.out.println(player1.getName() + "'s score: " + player1.getScore());
		System.out.println(player2.getName() + "'s score: " + player2.getScore()); 
		if (player1.getScore() > player2.getScore()) {
		  System.out.println(player1.getName() + " Wins!");
		} else if (player1.getScore() < player2.getScore()) {
		  System.out.println(player2.getName() + " Wins!");
		} else {
		  System.out.println("It's a draw!"); 
		}
		 

	}

}
