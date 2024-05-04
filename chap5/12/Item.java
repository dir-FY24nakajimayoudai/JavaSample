public class Item {
    private int id;
    private String name;
    public Item() {
        this(0, "T-shirt");
    }
    public Item(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void printItem(){
        System.out.println("Item id: " + id + " name:" + name);
    }

    public static void main(String[] args) {
        new Item().printItem();
        new Item(100, "Duke T-shirt").printItem();
        new Item(200, "Vintage Sun T-shirt").printItem();
    }
}

