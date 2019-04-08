package lesson7;

public class Plates {
    private int food;

    public Plates(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Plates{" +
                "food=" + food +
                '}';
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void addFood(int dose) {
        System.out.println("Добавим в тарелку еды (" + dose + " ед.).");
        food += dose;
    }
}
