package duck;

import duck.singleton.FarmerEagerSingleton;

public class Runner {

    public static void main(String[] args) {

        Duck rubberDuck = new RubberDuck();
        Duck mallardDuck = new MallardDuck();
        Duck greenWingedTealDuck = new GreenWingedTealDuck();

        System.out.println("RubberDuck");
        rubberDuck.fly();
        rubberDuck.quack();
        rubberDuck.swim();

        System.out.println("\nRubberDuck");
        mallardDuck.fly();
        mallardDuck.quack();
        mallardDuck.swim();

        System.out.println("\nGreenWingedTealDuck");
        greenWingedTealDuck.fly();
        greenWingedTealDuck.quack();
        greenWingedTealDuck.swim();


        //jajko
        DuckEgg.Builder builder = new DuckEgg.Builder();
        builder.setYolkWeight(28D);
        DuckEgg egg = builder.build();
        System.out.println(egg);

        //builder
        Fodder.Builder fodderBuilder = Fodder.builder(500,500);
        Fodder fodder = fodderBuilder
                .Minerals(true)
                .OatGrams(235)
                .build();




        //singleton zachlanny
        FarmerEagerSingleton singleton1 = FarmerEagerSingleton.getInstance();
        System.out.println("Singleton 1: " + singleton1.hashCode());
        singleton1.addDuck(mallardDuck);

        FarmerEagerSingleton singleton2 = FarmerEagerSingleton.getInstance();
        System.out.println("Singleton 2: " + singleton2.hashCode());
        System.out.println("Ilosc kaczek: " + singleton2.getAllDucks().size());

        //proxy to clasa contact to vet odsyla do vet. w niej moze byc valisacja
        System.out.println("Proxy\n");
        singleton1.askVet();
        System.out.println("Second ask");
        singleton1.askVet();


        //observer

        DuckCoop duckCoop = new DuckCoop();
        mallardDuck.walkToDuckCoop(duckCoop);
        rubberDuck.walkToDuckCoop(duckCoop);
        greenWingedTealDuck.walkToDuckCoop(duckCoop);
        rubberDuck.layEgg();
        mallardDuck.layEgg();


    }


}
