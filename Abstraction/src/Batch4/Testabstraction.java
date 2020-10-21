package Batch4;
abstract class Shape
{
	abstract void draw();
}
class Circle extends Shape{
	void draw()
	{
		System.out.println("drawing cicle");
	}
}
class Rectangle extends Shape{
	void draw()
	{
		System.out.println("drawing rectancle...");
	}
}
public class Testabstraction {
public static void main(String [] args)
{
	Shape s;
	s=new Circle();8
	s.draw();
}
}
