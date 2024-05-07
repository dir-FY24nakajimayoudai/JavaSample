public final class Super {}
class Sub extends Super {}
class Parent {
    public final void methodA() {}
    public static final void methodB() {}
}
class  Child extends Parent {
    public void methodA() {}
    public static final void methodB() {}
}