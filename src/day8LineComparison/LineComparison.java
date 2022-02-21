package day8LineComparison;

/*
 * modeling a line based on a point consisting of (x, y) coordinates
 * using the Cartesian system,So that can calculate its length.
 */

//import scanner class
import java.util.Scanner;

public class LineComparison {

	public static void lineComparision() {
		
		//create scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x1: ");
		int x1 = sc.nextInt();
		System.out.println("Enter the value of x2: ");
		int x2 = sc.nextInt();
		System.out.println("Enter the value of y1: ");
		int y1 = sc.nextInt();
		System.out.println("Enter the value of y2: ");
		int y2 = sc.nextInt();

		/*
		 * math.sqrt function use to calculate the square root of a given number
		 */
		double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Length of the line is: " + length1);
		sc.close();
	}

	public static void main(String[] args) {

		lineComparision(); //calling method
	}
}