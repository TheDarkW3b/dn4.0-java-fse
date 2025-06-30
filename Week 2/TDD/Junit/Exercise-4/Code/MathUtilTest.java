import org.junit.*;
import static org.junit.Assert.*;

public class MathUtilTest {

    private MathUtil util;

    @Before
    public void setUp() {
        util = new MathUtil();
    }

    @Test
    public void testSquare() {
        int result = util.square(4);
        assertEquals(16, result);
    }

    @After
    public void tearDown() {
        util = null;
    }
}
