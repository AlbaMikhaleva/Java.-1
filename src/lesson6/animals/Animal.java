package lesson6.animals;

public class Animal {
    protected int lengthRun;
    protected int lengthSwim;
    protected double height;
    protected String a;

    public Animal() {
    }

    public Animal(String a) {
        this.a = a;
    }

    public void run(int lengthRun) {
        System.out.println(a + " пробежала " + lengthRun);
    }

    public void swim(int lengthSwim) {
        System.out.println(a + " проплыла "+ lengthSwim);
    }

    public void jumpOverObstacles(double height) {
        System.out.println( a + " перепрыгнула препятствие "+ height);
    }
}
