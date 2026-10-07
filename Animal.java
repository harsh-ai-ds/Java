// 1. Main testing class (FIRST)
class Main {
    public static void main(String[] args) {
        // We use the interface type on the left, and concrete object on the right
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myDog.sleep();

        System.out.println("----------------");

        myCat.makeSound();
        myCat.sleep();
    }
}

// 2. Define the Interface (The Contract)
interface Animal {
    // Abstract methods (no body, ending with ;)
    void makeSound();
    void sleep();
}

// 3. Class 1 implementing the Interface
class Dog implements Animal {
    // Must provide body for makeSound()
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }

    // Must provide body for sleep()
    public void sleep() {
        System.out.println("Dog sleeps: Zzz...");
    }
}

// 4. Class 2 implementing the same Interface differently
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat says: Meow Meow!");
    }

    public void sleep() {
        System.out.println("Cat sleeps: Purr Zzz...");
    }
}