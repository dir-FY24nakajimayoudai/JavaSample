package ForDebag.src;

public class Main {
    String text = "A";
    void method() {
        text = "B";
    }
    void method(String t) {
        String text = "C";
        System.out.print(text);
    }
    public static void main(String[] args) {
        String text = "D";
        Main t = new Main();
        t.method("E"); 
        // C
        System.out.print(t.text);
        // A
        t.method();
        // 変数textにBが代入されるだけ
        System.out.print(text);
        // D
        System.out.print(t.text);
        // B
        
    }
}
