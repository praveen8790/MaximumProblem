import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void integer1() {
        Maximum max = new Maximum();
        Integer expected =6;
        Assert.assertEquals(expected, max.findMaximum(6,4,5));
    }
    @Test
    public void integer2() {
        Maximum max = new Maximum();
        Integer expected =6;
        Assert.assertEquals(expected, max.findMaximum(4,6,5));
    }
    @Test
    public void integer3() {
        Maximum max = new Maximum();
        Integer expected =6;
        Assert.assertEquals(expected, max.findMaximum(5,6,5));
    }
}
