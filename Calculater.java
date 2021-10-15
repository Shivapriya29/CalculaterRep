import java.util.Scanner;
public class Calculater{
	// main function
	public static void main(String[] args){
		// creating object to the class.
	Calculater c = new Calculater();
		Scanner s = new Scanner(System.in);
		// print the value 
		System.out.println("Enter a value");
		int a = s.nextInt();
		System.out.println("Enter b Value");
		int b = s.nextInt();
		int p = c.Addition(a,b);
		int q = c.Division(a,b);
		int r = c.Multiplication(a,b);
		int t = c.Subtraction(a,b);
		System.out.println("Value of Arthametic operaters is:");
		System.out.println(q);
		System.out.println(p);
		System.out.println(t);
		System.out.println(r);
	}
	int Addition(int a, int b){
		final int c = 10;
		int p = a + b + c;
		return p;
	}
	 int Division(int a , int b){
		 int q = a / b;
		 return q;
	 }
	int Multiplication(int a , int b){
		int r = a * b;
		return r ;
	}
	int Subtraction(int a , int b){
		int t = a - b;
		return t;
	}
	
}
