package program2;

public class Animal {
	    class Dog extends Animal {
	        void bark() {
	            System.out.println("Dog barks.");
	        }
	    }
	    public static void main(String[] args) {
	        Animal animal = new Animal();
	        Dog dog = animal.new Dog();
	        dog.bark(); 
	    }
	}


		
