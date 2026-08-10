import com.test.Wrapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordWrapperTest {
    @Test
    public void emptyStringTest(){
        String result = Wrapper.wrap("", 2);
        assertEquals("",result);
    }
}
