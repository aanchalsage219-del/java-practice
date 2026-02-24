abstract class Abs
{
	abstract void show();
	void display()
	{
		System.out.println("Inside Concrete Method");
	}
}
class SubAbs extends Abs
{
	void show()
	{
		System.out.println("Inside Abstract Method");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		
		Abs a = new Abs();
		SubAbs s = new SubAbs();
		s.show();
		s.display();

	}

}
