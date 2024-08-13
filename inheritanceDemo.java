class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Single inheritance: Dog is a subclass of Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Multilevel inheritance: BabyDog is a subclass of Dog
class BabyDog extends Dog {
    void weep() {
        System.out.println("BabyDog is weeping...");
    }
}

// Hierarchical inheritance: Cat and Lion are subclasses of Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("Lion is roaring...");
    }
}

// Hybrid inheritance: Tiger is a subclass of Cat and Lion
class Tiger extends Cat {
    void growl() {
        System.out.println("Tiger is growling...");
    }
}

public class inheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Accessing method from Animal class
        dog.bark(); // Accessing method from Dog class

        BabyDog babyDog = new BabyDog();
        babyDog.eat(); // Accessing method from Animal class
        babyDog.bark(); // Accessing method from Dog class
        babyDog.weep(); // Accessing method from BabyDog class

        Cat cat = new Cat();
        cat.eat(); // Accessing method from Animal class
        cat.meow(); // Accessing method from Cat class

        Lion lion = new Lion();
        lion.eat(); // Accessing method from Animal class
        lion.roar(); // Accessing method from Lion class

        Tiger tiger = new Tiger();
        tiger.eat(); // Accessing method from Animal class
        tiger.meow(); // Accessing method from Cat class
        tiger.growl(); // Accessing method from Tiger class
    }
}