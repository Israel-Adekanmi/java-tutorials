// Abstract superclass
abstract class Animal {
    public abstract void speak();
}

// Concrete subclass
class Dog extends Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Woof!");
    }

    // Nested class
    class Collar {
        void describe() {
            System.out.println(name + " wears a red collar.");
        }
    }
}

public class Week_6_Java_Inheritance {
    public static void main(String[] args) {
        // Polymorphism + Anonymous class
        Animal cat = new Animal() {
            @Override
            public void speak() {
                System.out.println("Cat says: Meow!");
            }
        };

        // Create Dog object and use all features
        Dog dog = new Dog("Bruno");
        dog.speak();

        Dog.Collar collar = dog.new Collar(); // Nested class usage
        collar.describe();

        cat.speak(); // Anonymous class object behavior
    }
}

