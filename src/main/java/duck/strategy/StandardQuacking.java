package duck.strategy;

public class StandardQuacking  implements Quacking{

    @Override
    public void quack() {
        System.out.println("Kwa kwa");
    }
}
