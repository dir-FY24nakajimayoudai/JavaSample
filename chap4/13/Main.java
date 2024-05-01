public class Main {
    public static void main(String[] args) {
        outer:
        for (int i = 0; true; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    System.out.println("i:" + i + " SKIP!");
                    continue outer;
                }
                if (i == 3) {
                    System.out.println("BREAK!");
                    break outer;
                }
                System.out.println("i:" + i + " j:" + j);
            }
        }
    }
}
