package duck.strategy;

public class FloatingDuck implements Swimming {
    @Override
    public void swimming() {
        System.out.println("I'm floating");
    }
}
