package com.github.aistomin.sample;

/**
 * Created by aistomin on 25.01.18.
 *
 * The class which contains demo examples of Java8 lambda expressions.
 */
final public class LambdaDemo {

    /**
     * Sample method.
     *
     * @return Always returns 666.
     */
    int sample() {
        return 666;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + new LambdaDemo().sample());
    }
}
