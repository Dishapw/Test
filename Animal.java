package Test;
/*Create a superclass called Animal with a method makeSound() 
that prints the sound made by the animal. Implement subclasses Dog, Cat, 
and Cow that inherit from the Animal class. Implement the makeSound() method 
in each subclass to print the sound made by a dog, cat, and cow, respectively.*/

public class Animal {
    public void makeSound() {
          System.out.println("The animal makes a sound");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("The cat makes sound as meow");
    }  
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("The dog makes sound as bark");
    }   
}

class Cow extends Animal {

    @Override
    public void makeSound() {
        System.out.println("The cow makes sound as moo");
    }  
}

class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new  Dog();
        Cow cow = new Cow();

         animal.makeSound();
         cat.makeSound();
         dog.makeSound();
         cow.makeSound();
    }
}