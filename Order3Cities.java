import java.util.Scanner;

public class H2Order3Cities {

	public static void main(String[] args) {
		
		String city1, city2, city3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first city: ");
		city1 = scan.nextLine();
		System.out.println("Enter the second city: ");
		city2 = scan.nextLine();
		System.out.println("Enter the third city: ");
		city3 = scan.nextLine();
		
		char city1Char = city1.charAt(0);
		char city2Char = city2.charAt(0);
		char city3Char = city3.charAt(0);

		String order;
		if (city1Char < city2Char && city1Char < city3Char) {
			order = city1;
			city1 = city2;
			city2 = order;
		}
		else if (city3Char < city1Char && city3Char < city2Char){
			order = city1;
			city1 = city3;
			city3 = order;
		}
		if (city3Char < city2Char) {
			order = city2;
			city1 = city3;
			city3 = order;
		}
		System.out.println("The three cities in alphabetical order are " + city1 + " " + city2 + " " + city3);
		
	}

}
