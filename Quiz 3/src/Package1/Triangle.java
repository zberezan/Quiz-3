package Package1;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	public Triangle() {
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea() {
		double area = java.lang.Math.sqrt((getPerimeter()/2) * ((getPerimeter()/2) - side1) * ((getPerimeter()/2) - side2) * ((getPerimeter()/2) - side3));
		//Truncates to two decimal places
		area = Math.floor(area * 100) / 100;
		return area;
	}

	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		perimeter = Math.floor(perimeter * 100) / 100;
		return perimeter;
	}

	public String toString() {
		return "created on " + getDateCreated() + "\ncolor: " + getColor() + " and filled: " + isFilled();
	}

}