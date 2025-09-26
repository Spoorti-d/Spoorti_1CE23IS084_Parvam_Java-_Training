package program2;

public class Mai {
	public String brand;
	public int year;

	public void display() {
		System.out.println("this is a display method");
	}

	public static void main(String[] args) {
		Mai car1 = new Mai();
		car1.brand = "Toyota";
		car1.year = 2022;
		car1.display();
	}
}
