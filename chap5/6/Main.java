/**
 * Item
 */
class Item {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Item item= new Item();
        item.setName("T-shirt");
        System.out.println("item : " + item.getName());
        // item.name="Sweater";
        // System.out.println("item.name : " + item.name);
    }    
}
