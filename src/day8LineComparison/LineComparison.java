package day8LineComparison;

/*
 * check equality of two lines based on the end points, 
 * So that know when two lines are the equal.
 */
import java.util.Scanner;

public class LineComparison {

	public static void lineComparision() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a1: ");
		int a1 = sc.nextInt();
		
		System.out.println("Enter the value of a2: ");
		int a2 = sc.nextInt();
		
		System.out.println("Enter the value of b1: ");
		int b1 = sc.nextInt();
		
		System.out.println("Enter the value of b2: ");
		int b2 = sc.nextInt();

		System.out.println("Enter the value of x1: ");
		int x1 = sc.nextInt();
		
		System.out.println("Enter the value of x2: ");
		int x2 = sc.nextInt();
		
		System.out.println("Enter the value of y1: ");
		int y1 = sc.nextInt();
		
		System.out.println("Enter the value of y2: ");
		int y2 = sc.nextInt();

		/*
		 * calculating length of two lines by using length formula and
		 * finding square root of that numbers
		 */
		double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Length of the line1 is: " + length1);

		double length2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
		System.out.println("Length of the line2 is: " + length2);
		
		sc.close();
	}

	private static void checkingEqualsLine(double length2, double length1) {
		int a = (int) length1; //double converted to int data type
		int b = (int) length2;
		
		
		/*
		 * checking equality of two lines by using if else statement
		 */
		if (a == b) {
			System.out.println("Lines are equal");
		} 
		else {
			System.out.println("Lines are not equal");
		}
	}

	public static void main(String[] args) {

		lineComparision();		//calling methods
		checkingEqualsLine(0,0);	
	}
}
