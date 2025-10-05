package Abstraction;
public class AbstractionDemo {
    public static void main(String[] args) {
        Animal dog = new Dog("nana");
        Animal cat = new Cat("nini");

        dog.makeSound();
        cat.makeSound();
        dog.sleep();

        Flyable bird = new Bird();
        bird.fly();
    }
}