public class Main {
    public static void main(String[] args) {
        int staVal1 = Sample.commonValue;
        Sample.printCommonValue();
        // int val1= Samole.value;
        // Sample.printValue();
        Sample s = new Sample();
        int val2 = s.value;
        s.printValues();
        int staVal2 = s.commonValue;
        s.printCommonValue();
    }
}
