public static Calculater{
	public static void main(String[] args){
	Calculater c = new Calculater();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = s.nextInt();
		System.out.println("Enter b Value");
		int b = s.nextInt();
		c.Addition(a,b);
		c.Division(a,b);
		c.Multiplication(a,b);
		c.Subtraction(a,b);
	}
}
