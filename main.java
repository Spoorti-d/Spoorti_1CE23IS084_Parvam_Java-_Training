package program2;

public class main {
	public static void main(String[] args) {
		int score = 95;
		String grade = switch (score / 10) {
			 case 10,9 -> "A";
			 case 7 -> "B";
			 case 8 ->"C";
			 default -> "F";

	};
	System.out.println("Grade: "+ grade);
	}
	}
	
