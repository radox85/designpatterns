package duck;

import duck.strategy.*;

import java.util.Random;

public class GreenWingedTealDuck implements Duck {
    private Quacking quackingStrategy;
    private Flying flyingStrategy;
    private Swimming swimmingStrategy;

    public GreenWingedTealDuck(){
        quackingStrategy = new StandardQuacking();
        flyingStrategy = new WingedFlying();
        swimmingStrategy = new SwimDuck();
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
        return new Random().nextInt(100);
    }

    @Override
    public Integer age() {
        return new Random().nextInt(1000) + 10;
    }

}
