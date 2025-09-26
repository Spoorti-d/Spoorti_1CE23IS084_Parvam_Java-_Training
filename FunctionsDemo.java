package program2;

public class FunctionsDemo {
	 public static int square(int x) {
	        return x * x;
	    }
	    public void greet() {
	        System.out.println("Hello!");
	    }

	    public void greet(String name) {
	        System.out.println("Hello, " + name + "!");
	    }

	    public static int sum(int... nums) {
	        int total = 0;
	        for (int n : nums) {
	            total += n;
	        }
	        return total;
	    }

	    public static void main(String[] args) {
	        FunctionsDemo obj = new FunctionsDemo();

	        System.out.println("Square of 5: " + square(5));
	        obj.greet();
	        obj.greet("Ram");

	        System.out.println("Sum of 1, 2, 3, 4: " + sum(1, 2, 3, 4));
	    }
	}
	
	
