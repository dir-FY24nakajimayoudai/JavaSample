public class Main {
    static {
        System.out.println("static Initializer... Main");
    }
    public static void main(String[] args) {
        new Test("new Test()");
    }
}

class Test {
    static int num;
    String s;
    static {
        num = 100;
        System.out.println("static Initializer... num : " + num);
    }
    {
        this.s = "TEST";
        System.out.println("Initializer... s : " + s);
    }
    public Test(String s) {
        this.s = s;
        System.out.println("Constructor... s : " + s);
    }
}
