public class App {
    public static void main(String[] args) throws Exception {
            int x = 50;
            if (x < 100) {
                System.out.println("A");
            } else if (x <= 100 && x >= 50) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        }
    }