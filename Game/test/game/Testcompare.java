package game;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Testcompare {
    @Test
    public void shouldnullReturnbWhennull(){
        CompareNumber comparenumber = new CompareNumber();

        assertThat( "4A0B",is(comparenumber.compare("1234","1234")));
    }
    @Test
    public void shouldaReturnbWhenb(){
        CompareNumber comparenumber = new CompareNumber();

        assertThat( "0A4B",is(comparenumber.compare("1234","4321")));
    }
    @Test
    public void shouldbbbbReturnbWhenbbbb(){
        CompareNumber comparenumber = new CompareNumber();

        assertThat( "0A0B",is(comparenumber.compare("1234","5678")));
    }
}






