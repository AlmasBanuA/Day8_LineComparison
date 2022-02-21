package day8LineComparison;

/*
 * compare two lines based on the end points, 
 * So that know one line is equal, greater or less than the other line.
 */
import java.util.Scanner;

public class LineComparison {

	public static double Length_Of_Line1;
	public static double Length_Of_Line2;

	public static void lineComparision() {
		System.out.println("Welcome To Line Comparison Program");
		Scanner S = new Scanner(System.in);

		System.out.println("Enter x Co-ordinate Number of First Point");
		int x1 = S.nextInt();
		System.out.println("Enter Y Co-ordinate Number Of First Point");
		int y1 = S.nextInt();

		System.out.println("Enter X Co-ordinate Number Of Second Point");
		int x2 = S.nextInt();
		System.out.println("Enter Y Co-ordinate Number Of Second Point");
		int y2 = S.nextInt();

		System.out.println("Enter P Co-ordinate Number Of Third Point");
		int p1 = S.nextInt();
		System.out.println("Enter Q Co-ordinate Number Of Third Point");
		int q1 = S.nextInt();

		System.out.println("Enter P Co-ordinate Number Of Forth Point");
		int p2 = S.nextInt();
		System.out.println("Enter Q Co-ordinate Number Of Forth Point");
		int q2 = S.nextInt();
		S.close();

		/*
		 * calculating length1 and length2 of two lines by using formula
		 */
		Length_Of_Line1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		Length_Of_Line2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));

		System.out.printf("length of 1st end points are : %.2f %n", Length_Of_Line1);
		System.out.printf("length of 2nd end points are : %.2f %n", Length_Of_Line2);
	}

	/*
	 * comparing the two lines based at the points and see if it is equal greater or less then other ones  
	 */
	public static void compareLineLength() {
		if (Length_Of_Line1 > Length_Of_Line2)
			System.out.println("length of 1st end points are Greater Than length of 2st end points ");
		else if (Length_Of_Line1 < Length_Of_Line2)
			System.out.println("length of 1st end points are Less Than length of 2st end points ");
		else
			System.out.println("Both Line Are  Equal");

	}

	public static void main(String[] args) {
		lineComparision();
		compareLineLength();
	}
}