package lesson7;

public class Main {
    public static void main(String[] args) {

        Cats[] cat = {new Cats("Кузя", 20, false),
                new Cats("Васька", 15, false),
                new Cats("Сёмка", 30, false)};

        Plates plate = new Plates(50);
        System.out.println(plate);

        for (Cats c : cat
        ) {
            c.eat(plate);
            c.checkingSatiety();
        }
        System.out.println();

        System.out.println(plate);
        plate.addFood(60);
        System.out.println(plate);

    }
}
