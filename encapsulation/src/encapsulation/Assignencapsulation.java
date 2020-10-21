package encapsulation;
class Auther
{
	private String aname;
	private String mail;
	private char gender;
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

}
class Book
{
	private String name;
	private String auther;
	private int price;
	private int quantyinstock;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantyinstock() {
		return quantyinstock;
	}
	public void setQuantyinstock(int quantyinstock) {
		this.quantyinstock = quantyinstock;
	}
	
}

public class Assignencapsulation 
{
	public static void main(String[] args)
	{
	  Auther a=new Auther();
	     a.setAname("ramesh");
	     a.setMail("sdgvs.gmail.com");
	     a.setGender('g');
	     
	  Book b=new Book();
	     b.setName("java");
	     b.setPrice(2000);
	     b.setQuantyinstock(250);
	     
	
	}

}
