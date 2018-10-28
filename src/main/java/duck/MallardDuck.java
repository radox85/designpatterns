package duck;

import duck.strategy.*;

import java.util.Random;

public class MallardDuck implements Duck {

    private Quacking quackingStrategy;
    private Flying flyingStrategy;
    private Swimming swimmingStrategy;
    private DuckCoop coop;
    private int totalEggs;

    public MallardDuck() {
        quackingStrategy = new StandardQuacking();
        flyingStrategy = new WingedFlying();
        swimmingStrategy = new SwimDuck();
        totalEggs = 0;
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
        return totalEggs;
    }

    @Override
    public Integer age() {
        return new Random().nextInt(1000) + 10;
    }

    @Override
    public DuckEgg layEgg() {
        //stworz jajo
        DuckEgg.Builder builder = new DuckEgg.Builder();
        builder.setYolkWeight(28D);
        DuckEgg egg = builder.build();
        totalEggs++;
        //informuj kacznik
        coop.notifyAboutEgg(egg);
        //zwroc jajo
        return egg;
    }

    @Override
    public void walkToDuckCoop(DuckCoop duckCoop) {
        duckCoop.register(this);
        this.coop = duckCoop;
    }

    @Override
    public void notify(DuckEgg egg) {
        System.out.println("My egg is huge!");
    }
}
