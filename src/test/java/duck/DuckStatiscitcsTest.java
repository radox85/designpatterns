package duck;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DuckStatiscitcsTest {

    @Test
    public void shouldReturnOldestDuck() {
        //given
        Duck duck1 = mock(Duck.class);
        when(duck1.age()).thenReturn(15);

        Duck duck2 = mock(Duck.class);
        doReturn(555).when(duck2).age();

        Duck duck3 = mock(Duck.class);
        doReturn(1).when(duck3).age();

        List<Duck> ducks = new ArrayList<>();
        ducks.add(duck1);
        ducks.add(duck2);
        ducks.add(duck3);

        DuckStatiscitcs duckStatiscitcs = new DuckStatiscitcs(ducks);
        //when
       Integer oldestDuck =  duckStatiscitcs.getOldestDuckAge();

        //then
        Assert.assertEquals((Integer)555,oldestDuck);
    }
}
