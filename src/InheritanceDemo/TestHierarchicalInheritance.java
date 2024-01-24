package InheritanceDemo;

class Bird1 {

	void fly()
	{
		System.out.println("fly");
	}
	
	
}

class Sparrow1 extends Bird
{
  void sparrowColor()
  {
	   System.out.println("Yellow");
  }
}

class Crow1 extends Bird
{
  void crowColor()
  {
	   System.out.println("Black");
  }
  

}


public class TestHierarchicalInheritance {
	  public static void main(String[] args)
	   {
		   Bird b = new Bird();
		   b.fly();
		   
		   Sparrow s = new Sparrow();
		   s.sparrowColor();
		   s.fly();
		   
		   Crow c = new Crow();
		   c.crowColor();
		   c.fly();
	   }
}
