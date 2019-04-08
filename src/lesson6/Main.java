package lesson6;

import lesson6.animals.Cat;
import lesson6.animals.Dog;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Кошка");
        cat.run(150);
        cat.swim (5);
        cat.jumpOverObstacles(1);
        System.out.println();

        Dog dog1 = new Dog("Собака1");
        dog1.limit();
        dog1.run(500);
        dog1.swim(9);
        dog1.jumpOverObstacles(2);
        System.out.println();

        Dog dog2 = new Dog("Собака2");
        dog2.limit();
        dog2.run(255);
        dog2.swim(7);
        dog2.jumpOverObstacles(0.1);

    }
}
