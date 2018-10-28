package duck.strategy;

public class SqueakNotQuacking implements Quacking {

    @Override
    public void quack() {
        System.out.println("PiPi");
    }
}
