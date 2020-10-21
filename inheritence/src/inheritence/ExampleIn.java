package inheritence;
class Employee
{
	double salary=10000.0;
	void location()
	{
		System.out.println("Employee from vijayawada");
	}
}
public class ExampleIn  extends Employee{
  public static void main( String [] args)
  {
	  //Employee e=new Employee();
	  ExampleIn o=new ExampleIn();
	  System.out.println(o.salary);
	   o.location();
  }
}
