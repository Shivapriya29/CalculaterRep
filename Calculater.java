import java.util.Scanner;
public static Calculater{
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
		c.Addition(a,b);
		c.Division(a,b);
		c.Multiplication(a,b);
		c.Subtraction(a,b);
		System.out.println(q);
		System.out.println(p);
		System.out.println(t);
		System.out.println(r);
	}
	int Addition(int a, int b){
		int p = a + b;
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
