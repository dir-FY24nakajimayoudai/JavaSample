public class Main {
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2;
        item2 = new Item();

        item1.name = "Sweater";
        String name = item1.getName();

        System.out.println("item1 : " + name);
        System.out.println("item2 : " + item2.getName());

    }    
}
