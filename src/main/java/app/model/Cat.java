package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {

    @Override
    public void makeSound() { // Реализация абстрактного метода
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return "I'm a Cat";
    }
}