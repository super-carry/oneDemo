package learning.eightChapter._interface;

public class interfaceTest {

}

interface Flyable{
    public static final int MIN_SPEED = 0;
    int MAX_SPEED = 7900;

    public abstract void fly();
}

interface Attackale{
    public abstract void attack();
}

class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println(111);
    }
}

class Bullet implements Flyable, Attackale{

    @Override
    public void fly() {
        System.out.println(222);
    }

    @Override
    public void attack() {
        System.out.println(333);
    }
}
