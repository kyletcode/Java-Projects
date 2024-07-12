import java.util.Scanner;

public class H2HeadsOrTails {

	public static void main(String[] args) {
		
		String userPick, programPick = null;
		
		int coinFlip = (int)(Math.random() * 2 + 1);
        if (coinFlip == 1) {
            programPick = "heads";
        }
        else if (coinFlip == 2) {
            programPick = "tails";
        }
        
        Scanner userGuess = new Scanner(System.in);
        System.out.println("The Program Has Flipped a Coin");
        System.out.println("Guess which side it landed by typing h (Heads) or t (Tails)");
		userPick = userGuess.nextLine();
		
		if (userPick.equals("h")) {
			userPick = "heads";
		}
		else if (userPick.equals("t")) {
			userPick = "tails";
		}
		
		System.out.println("The coin landed on " + programPick);
		System.out.println("You guessed " + userPick);
		
		if (programPick.equals(userPick)) {
			System.out.println("You Guess Correctly!");
		}
		else {
			System.out.println("Your Guess Was Incorrect");
		}
	}

}
