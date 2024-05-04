public class Sample {
    int num;
    
    int getName(int num) {
        return num;
    }

    void setNum(int num) {
        this.num = num;
        // id = num
    }

    void methodA(int id) {
        System.out.println(id);
    }

    void methodB(int id) {
        System.out.println(id);
    }
}
