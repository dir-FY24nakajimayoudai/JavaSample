// package chap6.2;
class Base {
    public void methodA(){
        System.out.println("Base#methodA()");
    }
    public void methodB(){
        System.out.println("Base#methodB()");
    }
}
public class Test extends Base {
    @Override
    public void methodA(){
        super.methodA();
        methodB();
    }
    public static void main(String[] args) {
        new Test().methodA();
    }
}
