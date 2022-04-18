class Animal {
    def animalSound() {
    println("The animal makes a sound");
    }
}

class Pig extends Animal {
    def animalSound() {
    println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    def animalSound() {
    println("The dog says: bow wow");
    }
}

class Main {
    static main( args) {
    Animal myAnimal = new Animal();
    Animal myPig = new Pig();
    Animal myDog = new Dog();
        
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
    }
}
