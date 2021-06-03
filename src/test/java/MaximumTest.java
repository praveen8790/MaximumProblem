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
    @Test
    public void float1() {
        Maximum max = new Maximum();
        Float expected =6.7f;
        Assert.assertEquals(expected, max.findMaximum(6.7f,1.6f,5.5f));
    }@Test
    public void float2() {
        Maximum max = new Maximum();
        Float expected =6.7f;
        Assert.assertEquals(expected, max.findMaximum(5.2f,6.7f,5.5f));
    }
    @Test
    public void float3() {
        Maximum max = new Maximum();
        Float expected =6.7f;
        Assert.assertEquals(expected, max.findMaximum(5.5f,1.6f,6.7f));
    }

}
