class Item {
    private int id = 100;
    public void printItem() {
        System.out.println("Item id : " + id);
    }
}
class Clothes extends Item {
    private String brand = "Java";
    public void printClothes(){
        System.out.println("Clothes brand : " + brand);
    }
}
class Main{
    public static void main(String[] args) {
        Clothes c = new Clothes();
        c.printItem();
        c.printClothes();
    }
}