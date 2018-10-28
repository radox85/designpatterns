package duck;

import java.util.Comparator;
import java.util.List;

public class DuckStatiscitcs {

    private List<Duck> ducks;

    public DuckStatiscitcs(List<Duck> ducks) {
        this.ducks = ducks;
    }

    public Integer getOldestDuckAge() {
/* PETLA
       Integer oldestDuckAge = Integer.MIN_VALUE;
        for (Duck duck : ducks) {
            if (duck.age() > oldestDuckAge){
                oldestDuckAge = duck.age();
            }

        }
        return oldestDuckAge;

*/
        return ducks.stream().sorted(Comparator.comparing(Duck::age).reversed())
                .findFirst()
                .map(Duck::age)
                .orElse(Integer.MIN_VALUE);
    }

}
