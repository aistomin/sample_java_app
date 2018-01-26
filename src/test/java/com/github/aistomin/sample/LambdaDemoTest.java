package com.github.aistomin.sample;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aistomin on 25.01.18.
 * <p>
 * Test for {@link LambdaDemo}
 */
public class LambdaDemoTest {

    /**
     * Check that we correctly calculate find max element in list.
     */
    @Test
    public void testMax() {
        final List<Integer> list = new ArrayList<>();
        final LambdaDemo demo = new LambdaDemo();
        Assert.assertNull(demo.max(list));
        list.add(0);
        Assert.assertEquals(new Integer(0), demo.max(list));
        list.add(1);
        Assert.assertEquals(new Integer(1), demo.max(list));
    }
}