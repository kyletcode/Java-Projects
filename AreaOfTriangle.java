import java.util.Scanner;

public class H1AreaOfTriangle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter 3 Points (Ex. x1 y1 x2 y2 x3 y3): ");
		float x1 = scan.nextFloat();
		float y1 = scan.nextFloat();
		float x2 = scan.nextFloat();
		float y2 = scan.nextFloat();
		float x3 = scan.nextFloat();
		float y3 = scan.nextFloat();
	//1.5 -3.4 4.6 5 9.5 -3.4
		
		float side1 = (float) Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		float side2 = (float) Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		float side3 = (float) Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		
		float s = (float) ((side1 + side2 + side3) / 2);
		float area = (float) Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		
		System.out.println("Area of Triangle is: " + area);
	}

}
