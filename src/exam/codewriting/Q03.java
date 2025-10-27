package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class Q03 {

	public static void boxy ( double xCtr , double yCtr , double halfLength, double halfLengthLimit ) {
		//your code here
	if (halfLength < halfLengthLimit) {
		StdDraw.show();
		return;

	}


	else {
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.square(xCtr, yCtr, halfLength);

		double newHalfLength = halfLength / 2;
		double xLeft = xCtr - halfLength;
		double xRight = xCtr + halfLength;
		double yDown = yCtr - halfLength;

		boxy(xLeft, yDown, newHalfLength, halfLengthLimit);
		boxy(xRight, yDown, newHalfLength, halfLengthLimit);
		}
	}

	public static void main(String[] args) {
		//Your task is to complete the above method to draw the image
		//shown in "image02.png" in the images folder.

		//Your solution must use recursion
		final double halfLength = 0.25;
		final double halfLengthLimit = halfLength / (Math.pow(2, 5));
		boxy (0.5 , 0.5 , halfLength, halfLengthLimit);
	}

}
