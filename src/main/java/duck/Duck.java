package duck;

public interface Duck{
    void quack();
    void swim();
    void fly();
   Integer totalEggsLaid();
   Integer age();
   DuckEgg layEgg();
   void walkToDuckCoop(DuckCoop duckCoop);
   void notify (DuckEgg egg);
}
