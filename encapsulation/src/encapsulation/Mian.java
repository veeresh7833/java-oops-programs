package encapsulation;
class Point
{
  private int x;
  private int y;
  public void setx (int x)
  {
   this.x = (x > 79 ? 79 : (x < 0 ? 0 : x));
  }
  public void sety (int y)
  {
   this.y = (y > 24 ? 24 : (y < 0 ? 0 : y));
  }
  public int getx ()
  {
    return x;
  }
  public int gety ()
  {
    return y;
  }


}

public class Mian
{
  public static void main (String[]args)
  {
    int a, b;
    Point p1 = new Point ();
      p1.setx (22);
      p1.sety (44);
      a = p1.getx ();
      b = p1.gety ();
      System.out.println ("the value of a is:" + a);
      System.out.println ("the value of b is:" + b);
  }
}
