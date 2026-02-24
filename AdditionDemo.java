import java.util.Scanner;

class AdditionDemo {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of a:");
		a = s.nextInt();
		System.out.println("Enter value of b:");
		b = s.nextInt();
		c = a+b;
		System.out.println("Sum = "+c);

	}

}
