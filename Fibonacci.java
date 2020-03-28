public class Fibonacci { 

	public static void main(String[] args) {
		Fib();
	}
	
	public static void Fib() {
		int a = 0;
		int b = 1; //The first two numbers
		int c; //the sum of the first two numbers
		System.out.println(a);
		System.out.println(b);
		for (int i=3;i<=20;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c; //Continue the above loop
		}
		
	}
}
