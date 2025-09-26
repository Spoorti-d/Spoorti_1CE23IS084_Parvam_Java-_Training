package program2;

public class OverloadExample {
	public void greet() {
		System.out.println("Hello!");
	}
		public void greet(String name) {
			System.out.println("Hello, " + name + "!");
		}
		public static void main(String[] args) {
			OverloadExample obj = new OverloadExample();
			obj.greet();
			obj.greet("Murthy");
	}

}
