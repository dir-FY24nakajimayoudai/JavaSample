package ForDebag.src;

public class Test {
    public int foo(int x, int y) {
        return x*y;
    }
    public void bar (Integer i){
        System.out.print(i);
    }
    public void bar (float i) {
        System.out.print(i);
    }
    public void bar (String... s) {
        System.out.println(s.length);
    }
    public static void main(String[] args) {
        Test t = new Test();
        System.out.print(t.foo(10, 2));
        t.bar(7);
        t.bar();
    }
}
