abstract class Transport {
    private int speed;

    public Transport(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract void move();
}
class Airplane extends Transport {
    public Airplane(int speed) {
        super(speed);
    }
    @Override
    public void move() {
        System.out.println("Airplane : flying at " + getSpeed() + "km/h");
    }
}
class Ship extends Transport {
    public Ship(int speed) {
        super(speed);
    }
    @Override
    public void move(){
        System.out.println("Ship : cruising at " + getSpeed() + "knots");
    }
}
abstract class Car extends Transport {
    public Car(int speed) {
        super(speed);
    }
}
public class Main {
    public static void main(String[] args) {
        new Airplane(900).move();
        new Ship(20).move();
    }
}
