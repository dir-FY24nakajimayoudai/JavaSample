public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                System.out.println("Skip!");
                continue;
            }
            System.out.println(i);
        }
    }
}
