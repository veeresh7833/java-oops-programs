package inheritence;

public class polymorphism {
 public static void main(String[] args)
 {
	A ref1=new A();
	A ref2=(A)ref1;
	System.out.println(ref2.f());
 }
}
class A{
	int f()
	{
		return 0;
	}
}
class B extends A{
	int f()
	{
		return 1;
	}
}
class C extends B{
	int f()
	{
		return 2;
	}
}
