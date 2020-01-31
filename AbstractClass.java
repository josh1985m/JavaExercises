	abstract class Shape
	{
		int x;
		int y;
		abstract int printArea();
	}
	class Rectangle extends Shape
	{
		public int printArea()
		{
			int area = x * y;
			System.out.println("The area of the shape is: " + area);
			return area;
		}
	}
	class Triangle extends Shape
	{
		public int printArea()
		{
			int area = x * y;
			System.out.println("The area of the shape is: " + area);
			return area;
		}
	}
	class Circle extends Shape
	{
		public int printArea()
		{
			int area = x * y;
			System.out.println("The area of the shape is: " + area);
			return area;
			
		}
	}
class AbstractClass{
	public static void main(String[] args)
	{
		Shape obj = new Circle();
		obj.printArea();
	}
}
		
		
		
		