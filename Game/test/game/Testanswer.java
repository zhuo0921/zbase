package game;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Testanswer {
    @Test
    public void shouldshould(){
        AnswerGenerator answergenerator = new AnswerGenerator();
        assertThat(true,is(compare( answergenerator.answer()  )));
    }
    public boolean compare(String answer) {
        AnswerGenerator answergenerator = new AnswerGenerator();
        char[] answer1 = new char[4];
        for (int i = 0; i < answer.length(); i++) {
            answer1[i] = answer.charAt( i );
        }
        Arrays.sort( answer1 );
        for (int i = 1; i < answer1.length; i++) {
            if (answer1[i - 1] == answer1[i]) {
                return false;
            }
        }
        return true;
    }
}
