class Counter
{
	int count;//instance var
	Counter()
	{
		System.out.println("***No Args Const Called***");
		count = 0;
	}
	Counter(int count)//local val
	{
		System.out.println("***One Args Const Called***");
		this.count = count;
	}
	void show()
	{
		System.out.println("Count = "+count);
	}
	void inc()
	{
		count++;
	}
	void dec()
	{
		count--;
	}
}

public class ConstructorDemo1 {

	public static void main(String[] args) {
			
		Counter c1 = new Counter();
		c1.show();
		
		Counter c2 = new Counter(10);
		c2.show();
		
		c1.inc();
		c1.inc();
		
		c2.dec();
		c2.dec();
		
		c1.show();
		c2.show();

	}
}
