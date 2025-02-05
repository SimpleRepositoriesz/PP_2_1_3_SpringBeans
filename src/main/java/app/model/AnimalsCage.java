package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private final Animal animal;
    private final Timer timer;

    @Autowired
    public AnimalsCage(
            @Qualifier("dog") Animal animal, // Указываем имя бина
            Timer timer
    ) {
        this.animal = animal;
        this.timer = timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
    }

    // Геттеры
    public Timer getTimer() {
        return timer;
    }
}