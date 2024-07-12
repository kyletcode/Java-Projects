import java.util.Scanner;

public class H2HexToBinary {

	public static void main(String[] args) {
		
		String binaryValue = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a hex digit: ");
		
		String userInput = scan.nextLine();
		String pickHex = userInput.toUpperCase();
		
		if (pickHex.length() != 1) {
			System.out.println("Enter only one character, ex. 1 or A");
			System.exit(1);
		}
		
		char ch = pickHex.charAt(0);
		if ((ch >= 'A' && ch <= 'F') || (ch >= '0' && ch <= '9'))
		{
			switch(ch) {
			case '0':
				binaryValue = "0000";
				break;
			case '1':
				binaryValue = "0001";
				break;
			case '2':
				binaryValue = "0010";
				break;
			case '3':
				binaryValue = "0011";
				break;
			case '4':
				binaryValue = "0100";
				break;
			case '5':
				binaryValue = "0101";
				break;
			case '6':
				binaryValue = "0110";
				break;
			case '7':
				binaryValue = "0111";
				break;
			case '8':
				binaryValue = "1000";
				break;
			case '9':
				binaryValue = "1001";
				break;
			case 'A':
				binaryValue = "1010";
				break;
			case 'B':
				binaryValue = "1011";
				break;
			case 'C':
				binaryValue = "1100";
				break;
			case 'D':
				binaryValue = "1101";
				break;
			case 'E':
				binaryValue = "1110";
				break;
			case 'F':
				binaryValue = "1111";
				break;
			}
			
			System.out.println("The binary value is " + binaryValue);
			
		} else
			System.out.println(ch + " is an invalid input");
		
	}

}
