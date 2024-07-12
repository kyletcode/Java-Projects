import java.util.Scanner;

public class H1FinAppCalTips {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the subtotal and a gratuity rate: ");
		double subtotal = scan.nextDouble();
		double gratuityRate = scan.nextDouble();
		
		double gratuity = subtotal * gratuityRate / 100;
		double total = subtotal + gratuity;
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
		
		
	}

}
