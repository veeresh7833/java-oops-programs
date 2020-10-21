package inheritence;
class Animal
{
	String color="white";
}
class Person extends Animal
{
	String color="red";
}
class Dog extends Person
{
	String color="black";
	void printcolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class Testsuper1 {
  public static void main(String [] args)
  {
	  Dog d=new Dog();
	  d.printcolor();
  }
}
