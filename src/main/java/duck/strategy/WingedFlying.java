package duck.strategy;

import duck.strategy.Flying;

public class WingedFlying implements Flying {
    @Override
    public void fly(){
        System.out.println("Flying on wings");
    }
}
