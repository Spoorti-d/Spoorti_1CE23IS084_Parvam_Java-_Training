package program2;

public class DataTypeExample {
    static int staticvar = 100; 
    int instanceVar = 50;

    public void display() {
        int localvar = 25;
        System.out.println("Static: " + staticvar);
        System.out.println("Instance: " + instanceVar);
        System.out.println("Local: " + localvar);
    }

    public static void main(String[] args) {
        DataTypeExample obj = new DataTypeExample();
        obj.display();
    }
}


 