package chap6.2;

class X{}
class Y extends X {}
class Super {
    X method(int a, String b) {return new X();}
}
class Sub extends Super {
    @Override
    Y method(int a, String b) { return new Y();}
}
class Sub2 extends Super {
    @Override
    public X method(int a, String b){ return new X();}
}