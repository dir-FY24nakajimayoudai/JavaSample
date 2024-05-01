import javax.management.RuntimeErrorException;

public class Main {
    public static void main(String[] args) {
        // String s = "A";
        String s = "";
        switch (s) {
            case "A", "B" -> System.out.println("A-B");
            case "C", "D" -> System.out.println("C-D");
            case "E", "f" -> { System.out.println("E-F"); break;}
            // case "6":
            default -> throw new RuntimeErrorException(null, "N/A");
        }
    }
}
