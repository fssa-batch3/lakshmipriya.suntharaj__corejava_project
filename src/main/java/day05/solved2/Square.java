package day05.solved2;

import day05.solved.Rectangle;
import day05.solved.Square;

public class Square extends Rectangle {

	public Square(double length, double breadth) throws Exception {
		super(length, breadth);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param length
	 * @param breadth
	 * @throws Exception
	 */
	public Square(double sideLength) throws Exception {
		super(sideLength, sideLength);
		
	}
	
	public static void main(String[] args) {
		try {
		Square square = new Square(1.0);
		System.out.println(square.numberOfSides);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}