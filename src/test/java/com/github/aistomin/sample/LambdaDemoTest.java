package com.github.aistomin.sample;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aistomin on 25.01.18.
 * <p>
 * Test for {@link LambdaDemo}
 */
public class LambdaDemoTest {

    /**
     * Check that .sample() method is working.
     */
    @Test
    public void testSample() {
        Assert.assertEquals(666, new LambdaDemo().sample());
    }
}