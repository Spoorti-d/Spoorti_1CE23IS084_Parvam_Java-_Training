package program2;

public class calculator {
	int add(int a, int b) {
		return a + b;
	}
	public static void main(String[] args) {
		calculator c = new calculator();
		int sum = c.add(5, 4);
		System.out.println("Sum = " + sum);
	}
}
