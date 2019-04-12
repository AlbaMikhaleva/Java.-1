package lesson6.animals;

import java.util.Random;

public class Cat extends Animal {
    public Cat(String a) {
        super(a);
    }

    int lengthRunMax = 200;
    int lengthSwimMax = 0;
    double heightMax = 2;

          @Override
    public void run(int lengthRun) {
        if (lengthRun > lengthRunMax) {
            System.out.println(a + " столько не может пробежать.");
        } else {
            System.out.println(a + " пробежала " + lengthRun + " м.");

        }
    }

    public void swim(int lengthSwim) {
        if (lengthSwim > lengthSwimMax) {
            System.out.println(a + " не умеет плавать.");
        } else {
            System.out.println(a + " проплыла " + lengthSwim + " м.");
        }
    }

    public void jumpOverObstacles(double height) {
        if (height > heightMax) {
            System.out.println(a + " так высоко не прыгает.");
        } else {
            System.out.println(a + " перепрыгнула препятствие и прыгнула " + height + " м " + " в высоту.");
        }
    }
}