//Save as Square.java
package mypackage1;
public class Square
{
	public void area(int side)
	{
		System.out.println("Area of square = "+side*side);
	}
	public static void main(String args[])
	{
		Square s = new Square();
		s.area(5);
	}
}
