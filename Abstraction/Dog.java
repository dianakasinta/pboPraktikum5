package Abstraction;
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println(name + " menggonggong: Woof! Woof!");
    }
}