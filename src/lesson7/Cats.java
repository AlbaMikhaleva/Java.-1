package lesson7;

public class Cats {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cats(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void eat(Plates plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            System.out.println(name + " кушает....");
            satiety = true;
        } else {
            System.out.println("В тарелке недостаточно еды!");
            satiety = false;
        }
    }

    public void checkingSatiety() {
        if (satiety == true) {
            System.out.println(name + " наелся.");
        } else {
            System.out.println(name + " остался голодным.");
        }
    }

}


