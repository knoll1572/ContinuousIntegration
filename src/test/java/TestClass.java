import org.junit.Assert;
import org.junit.Test;

public class TestClass {
    @Test
    public void Addition() {
///test
        final int expected = 420;
        final int actual = Math.add(400, 20);
        Assert.assertEquals(actual, expected);
    }
}
