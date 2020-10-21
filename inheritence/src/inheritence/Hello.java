package inheritence;
public class Hello {
String name;
int id;
Hello(int id,String name)
{
	this.id=id;
this.name=name;	
}
void info()
{
	System.out.println("id:   "+id+"name:   "+name);
}
public static void main(String [] args)
{
	Hello obj=new Hello(23,"veeresh");
	obj.info();
}
}
