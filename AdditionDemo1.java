import java.util.Scanner;

class Addition1
{
	int a,b;//data members 
	void getData()//member methods of class
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first value:");
		a = s.nextInt();
		System.out.println("Enter second value :");
		b = s.nextInt();
	}
	void calculate()
	{
		int c;
		c = a+b;
		System.out.println("Sum = "+c);
	}
}
public class AdditionDemo1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello....!");
		
		Addition1 a1 = new Addition1();
		a1.getData();
		Addition1 a2 = new Addition1();
		a2.getData();
		
		a1.calculate();
		a2.calculate();
		System.out.println("Bye......!");
	}

}
