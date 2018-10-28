package duck.strategy;

public class SwimDuck implements Swimming {
    @Override
    public void swimming() {
        System.out.println("I'm swimming");
    }
}
