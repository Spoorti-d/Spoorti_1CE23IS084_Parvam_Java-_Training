package program2;

public class cls{
	    private String name;
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getName() {
	        return name;
	    }

	    public static void main(String[] args) {
	        cls p = new cls();
	        p.setName("John");
	        System.out.println(p.getName());
	    }
	}
