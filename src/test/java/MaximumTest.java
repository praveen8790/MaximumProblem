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
        Float expected =  6.7f;
        Assert.assertEquals(expected, max.findMaximum(6.7f,2.4f,3.6f));
    }
    @Test
    public void float2() {
        Maximum max = new Maximum();
        Float expected =  6.7f;
        Assert.assertEquals(expected, max.findMaximum(4.7f,6.7f,3.6f));
    }
    @Test
    public void float3() {
        Maximum max = new Maximum();
        Float expected =  6.7f;
        Assert.assertEquals(expected, max.findMaximum(5.2f,2.4f,6.7f));
    }
}
