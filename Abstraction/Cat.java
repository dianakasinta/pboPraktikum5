package Abstraction;
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " mengeong: Meow!");
    }
}
