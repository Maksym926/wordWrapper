import com.test.Wrapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordWrapperTest {
    @Test
    public void emptyStringTest(){
        String result = Wrapper.wrap("", 2);

        assertEquals("",result);
    }
    @Test
    public void moreColumnsThanLettersTest(){
        String result = Wrapper.wrap("abcd", 6);

        assertEquals("",result);
    }
    @Test
    public void splitWordWithoutWhiteSpaceTest(){
        String result = Wrapper.wrap("abcdefg", 2);

        assertEquals("ab\ncd\nef\ng", result);
    }
    @Test
    public void splitWordWithWhiteSpacesCasaTest(){
        String result = Wrapper.wrap("abc defm w nf" , 2);

        assertEquals("ab\nc\nde\nfm\nw\nnf", result);
    }


}
