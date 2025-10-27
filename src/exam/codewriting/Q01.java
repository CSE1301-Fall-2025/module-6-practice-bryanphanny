package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class Q01 {

	public static void recursiveCarpet ( double xCtr , double yCtr , double halfLength, double halfLengthLimit) {
		//your code here
		// Moves halfLength away in both x and y direction in each corner
	
		if (halfLength < (halfLengthLimit)) {
			StdDraw.show();
			return;
		
		}
		
		else {
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.filledSquare(xCtr, yCtr, halfLength);

			double newHalfLength = halfLength / 3;
			double rightXCtr = xCtr +  2 * halfLength;
			double leftXCtr = xCtr - 2 * halfLength;
			double topYCtr = yCtr + 2 * halfLength;
			double bottomYCtr = yCtr - 2 * halfLength;

			recursiveCarpet(rightXCtr, topYCtr, newHalfLength, halfLengthLimit);
			recursiveCarpet(rightXCtr, bottomYCtr, newHalfLength, halfLengthLimit);
			recursiveCarpet(leftXCtr, topYCtr, newHalfLength, halfLengthLimit);
			recursiveCarpet(leftXCtr, bottomYCtr, newHalfLength, halfLengthLimit);
		}
	}

	public static void main(String[] args) {
		//Your task is to complete the above method to draw the image
		//shown in "image01.png" in the images folder.

		//Your solution must use recursion

		double halfCarpetLength = 0.125 ;
		final double halfLengthLimit = halfCarpetLength / (Math.pow(3, 3));
		recursiveCarpet (0.5 , 0.5 , halfCarpetLength, halfLengthLimit) ;
	}

}
