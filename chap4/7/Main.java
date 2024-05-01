public class Main {
    public static void main(String[] args) {
        int [] array = {1, 2, 3};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n----------");
        for (int i = array.length-1 ; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n----------");
        for (int i = 0; i < array.length; i++) {
            int e = array[i];
            System.out.print(e + " ");
        }
    }
}
