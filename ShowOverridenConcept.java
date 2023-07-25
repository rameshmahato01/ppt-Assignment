package basicpgm;

class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // Method overridden from the parent class
    @Override
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }

    // New method specific to the Dog class
    public void fetch() {
        System.out.println("The dog is fetching the ball.");
    }
}

public class ShowOverridenConcept {

	public static void main(String[] args) {
		  Animal anml = new Animal();
	        Animal dog = new Dog();

	        // Calling the method from the parent class
	        anml.makeSound(); 

	        //calling the overridden method from the child class
	        dog.makeSound(); 

	        ((Dog) dog).fetch(); 
		// TODO Auto-generated method stub

	}

}
