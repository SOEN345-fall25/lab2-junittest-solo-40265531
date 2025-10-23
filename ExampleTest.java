import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest {

    Example myExample = new Example(1, 2);

    @Test public void TestFunction_A_PositiveY() {
        int y = 5;
        int expected = y + myExample.a;

        int result = myExample.Function_A(y);

        assertEquals(result, 6);
    }

    @Test public void TestFunction_A_LessThanOne() {
        int y = 0;
        int expected = y - myExample.a;

        int result = myExample.Function_A(y);

        assertEquals(result, -1);
    }

    @Test public void TestFunction_B_EqualOrLessThan6() {
        int x = 0;
        int expected = x - myExample.b;

        int result = myExample.Function_B(x);

        assertEquals(result, 2);
    }

    @Test public void TestFunction_B_MoreThan6() {
        int x = 12;
        int expected = x + myExample.b;

        int result = myExample.Function_B(x);

        assertEquals(result, 10);
    }

}
