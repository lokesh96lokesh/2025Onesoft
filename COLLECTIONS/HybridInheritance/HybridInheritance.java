package onesoftday1.HybridInheritance;

public class HybridInheritance {
	 public static void main(String[] args) {
	        Eats obj = new Eats();
	        obj.isAlive();
	        obj.barks();
	        obj.meow();
	    }
	}

	interface Animal {
	    void isAlive();
	}

	interface Dog extends Animal {
	    void barks();
	}

	interface Cat extends Animal{
	    void meow();
	}

	class Eats implements Dog, Cat {
		
	    
	    public void isAlive() {
	    	System.out.println("all animals are alive");
	    }

	    public void barks() {
	        System.out.println("Dog barks");
	    }

	    
	    public void meow() {
	        System.out.println("Cat *meow*");
	    }

		}
