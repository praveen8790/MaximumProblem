import org.junit.Assert;
import org.junit.Test;

public class MaximumTest<T extends Comparable<T>> {
    @Test
    public void integer1() {
        Maximum max =  new Maximum(6,4,5);
        Integer expected = 6;
        Assert.assertEquals(expected, max.max());
    }
    @Test
    public void integer2() {
        Maximum max = new Maximum(4,6,5);
        Integer expected =6;
        Assert.assertEquals(expected, max.max());
    }
    @Test
    public void integer3() {
        Maximum max = new Maximum(5,6,5);
        Integer expected =6;
        Assert.assertEquals(expected, max.max());
    }
    @Test
    public void float1() {
        Maximum max = new Maximum(6.7f,1.6f,5.5f);
        Float expected =6.7f;
        Assert.assertEquals(expected, max.max());
    }@Test
    public void float2() {
        Maximum max = new Maximum(5.2f,6.7f,5.5f);
        Float expected =6.7f;
        Assert.assertEquals(expected, max.max());
    }
    @Test
    public void float3() {
        Maximum max = new Maximum(5.5f,1.6f,6.7f);
        Float expected =6.7f;
        Assert.assertEquals(expected, max.max());
    }
    @Test
    public void string1() {
        Maximum max = new Maximum("how are you","hii","bye");
        String expected ="how are you";
        Assert.assertEquals(expected, max.max());
    }
    @Test
    public void string2() {
        Maximum max = new Maximum(" you","how are you","bye");
        String expected ="how are you";
        Assert.assertEquals(expected, max.max());
    }
    @Test
    public void string3() {
        Maximum max = new Maximum("how are u","hii","how are you");
        String expected ="how are you";
        Assert.assertEquals(expected, max.max());
    }



}
