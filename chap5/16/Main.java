import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Main obj = new Main();
        obj.methodB(array);
        System.out.println("main() array : " + Arrays.toString(array));
        
    }   
    public void methodB(int[] ary){
        ary[1] = 5;
        System.out.println("methodB() ary : " + Arrays.toString(ary));
    } 
}
