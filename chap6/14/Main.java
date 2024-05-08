interface Eatable {
    void showCalories();
}
class Item {
    String name;
    Item(String name) {
        this.name = name;
    }
}
class Food extends Item implements Eatable {
    private int calories;
    public Food(String name, int calories) {
        super(name);
        this.calories = calories;
    }
    @Override
    public void showCalories() {
        System.out.println(name + " : " + calories + "kcal/100g");
    }
}
public class Main {
    public static void main(String[] args) {
        Food f = new Food("Chocolate", 500);
        f.showCalories();
    }
}
