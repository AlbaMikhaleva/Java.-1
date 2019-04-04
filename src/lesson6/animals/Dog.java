package lesson6.animals;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Dog extends Animal {
    public Dog(String a) {
        super(a);
    }

    Random rand = new Random();

    int lengthRunMax = rand.nextInt(501);
    int lengthSwimMax = rand.nextInt(11);
    double r = rand.nextDouble();
    double heightMax = r * 0.51;

    public void limit() {
        System.out.println("Ограничения: бег " + lengthRunMax + "; плавание " + lengthSwimMax + "; прыжок " + heightMax);
    }

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
            System.out.println(a + " столько не может проплыть.");
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