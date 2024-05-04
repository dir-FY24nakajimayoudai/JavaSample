public class Sample {

    public void method(char... c) {
        System.out.print("method(char... c) : ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
    }

    public void method(String s, int... i) {
        System.out.print("method(String s, int... i) : " + s + ":");
        for (int j : i) {
            System.out.print(j);
        }
        System.out.println("/ i.length : " + i.length);
    }

    public void method(int i, int... j) {
        System.out.print("method(int i, int... j) : " + i + ":");
        for (int v : j) {
            System.out.print(v);
        }
        System.out.println();
    }

    public void method(int i, int j) {
        System.out.println("method(int i, int j) : " + i + ":" + j);
    }

    public static void main(String... args) {
        Sample s = new Sample();
        s.method('a', 'b', 'c');
        s.method(new char[]{'A', 'B', 'C'});

        s.method("Sample with data", 1, 2, 3);
        s.method("Sample without data");
        s.method(1,2,3,4,5,6,7,8);
        s.method(100, 200);
    }
}
