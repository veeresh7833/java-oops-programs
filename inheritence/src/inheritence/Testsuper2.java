package inheritence;
class Animal1
{
	void eat()
	{
		System.out.println("eating......");
	}
	Animal1()
	{
		System.out.println("animal is created");
	}
}

class Dog1 extends Animal1
{
	void eat() {
		System.out.println("eating bread");
	}
	void bark()
	{
		System.out.println("barking....");
		
	}
	void work()
	{
		super.eat();
		bark();
	}
	Dog1()
	{
		super();
		System.out.println("dog is created");
	}
}
public class Testsuper2 {
  public static void main(String [] args)
  {
	  Dog1 d=new Dog1();
	  //d.work();
  }
}
