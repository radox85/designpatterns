package duck;

import java.util.ArrayList;
import java.util.List;

public class DuckCoop {

    private List<Duck> ducks;

    public DuckCoop(){
        ducks = new ArrayList<>();
    }

    public void register(Duck duck){
        ducks.add(duck);
    }

    public void unregister(Duck duck){
        ducks.remove(duck);
    }

    public void notifyAboutEgg(DuckEgg egg){
        for (Duck d : ducks){
            d.notify(egg);
        }
    }
}
