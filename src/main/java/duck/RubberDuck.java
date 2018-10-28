package duck;

import duck.strategy.*;

import java.util.Random;

public class RubberDuck implements Duck {

    private Quacking quackingStrategy;
    private Flying flyingStrategy;
    private Swimming swimmingStrategy;

    public RubberDuck() {
        quackingStrategy = new SqueakNotQuacking();
        flyingStrategy = new FallingNotFlying();
        swimmingStrategy = new FloatingDuck();
    }


    @Override
    public void quack() {
        quackingStrategy.quack();
    }

    @Override
    public void swim() {
        swimmingStrategy.swimming();
    }

    @Override
    public void fly() {
        flyingStrategy.fly();
    }

    @Override
    public Integer totalEggsLaid() {
        return 0;
    }

    @Override
    public Integer age() {
        return new Random().nextInt(10000) + 10;
    }
}
