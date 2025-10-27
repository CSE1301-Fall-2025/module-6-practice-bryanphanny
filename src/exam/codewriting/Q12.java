package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;


public class Q12 {

	public static void rDrawSquare ( double xCtr , double yCtr , double size, double sizeSquareLimit, double sizeCircleLimit) {
		double xRight = xCtr + size;
		double xLeft = xCtr - size;
		double yUp = yCtr + size;
		double yDown = yCtr - size;
		double halfSize = size / 2;

		if (size < sizeCircleLimit) {
			// rDrawCircle
			StdDraw.show();
		}

		else if (size >= sizeSquareLimit) {
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.square(xCtr, yCtr, size);
			rDrawSquare(xLeft, yUp, halfSize, sizeSquareLimit, sizeCircleLimit);
			rDrawSquare(xRight, yDown, halfSize, sizeSquareLimit, sizeCircleLimit);
		}
		else if (size < sizeSquareLimit && size >= sizeCircleLimit) {
			StdDraw.circle(xCtr, yCtr, size);
			rDrawSquare(xRight, yDown, halfSize, sizeSquareLimit, sizeCircleLimit);
			rDrawSquare(xLeft, yUp, halfSize, sizeSquareLimit, sizeCircleLimit);

		}
	}


	public static void main(String[] args) {
		//Your task is to complete the above method to draw the image
		//shown in "image03.png" in the images folder.

		//Your solution must use recursion
		double squareSize = 0.25;
		double squareSizeLimit = squareSize / Math.pow(2, 2);
		double circleSizeLimit = squareSizeLimit / Math.pow(2, 5);
		rDrawSquare(0.5 , 0.5 , squareSize, squareSizeLimit, circleSizeLimit);


	}

}
