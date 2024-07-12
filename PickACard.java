
public class H2PickACard {

	public static void main(String[] args) {
		
		String suit = null;
		
		int suitNum = (int)(Math.random() * 4 + 1);
		System.out.println("You picked a random card out of the deck");
		
		if (suitNum == 1) {
			suit = "Spades";
		}
		
		else if (suitNum == 2) {
			suit = "Clubs";
		}
		
		else if (suitNum == 3) {
			suit = "Diamonds";
		}
		
		else if (suitNum == 4) {
			suit = "Hearts";
		}
		
		String rank = null;
		int rankNum = (int)(Math.random() * 13 + 1);
		
		if (rankNum == 1) {
			rank = "Ace";
		}
		
		else if (rankNum == 2) {
			rank = "2";
		}
		
		else if (rankNum == 3) {
			rank = "3";
		}
		
		else if (rankNum == 4) {
			rank = "4";
		}
		
		else if (rankNum == 5) {
			rank = "5";
		}
		
		else if (rankNum == 6) {
			rank = "6";
		}
		
		else if (rankNum == 7) {
			rank = "7";
		}
		
		else if (rankNum == 8) {
			rank = "8";
		}
		
		else if (rankNum == 9) {
			rank = "9";
		}
		
		else if (rankNum == 10) {
			rank = "10";
		}
		
		else if (rankNum == 11) {
			rank = "Jack";
		}
		
		else if (rankNum == 12) {
			rank = "Queen";
		}
		
		else if (rankNum == 13) {
			rank = "King";
		}
		
		System.out.println("The card you picked is " + rank + " of " + suit);
		
		
	}

}
