package duck.strategy;

public class FallingNotFlying implements Flying {
    @Override
    public void fly() {
        System.out.println("Im not flying, I'm falling");
    }
}
