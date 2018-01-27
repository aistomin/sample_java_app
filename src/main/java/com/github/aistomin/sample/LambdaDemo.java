package com.github.aistomin.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by aistomin on 25.01.18.
 * <p>
 * The class which contains demo examples of Java8 lambda expressions.
 */
final public class LambdaDemo {

    /**
     * Find max element in list.
     * @param list The list.
     * @return Max element or null if the list is empty.
     */
    Integer max(final List<Integer> list) {
        return list.stream().max(Integer::compareTo).orElse(null);
    }

    /**
     * Calculate the sum of the integers in the list.
     * @param list The list.
     * @return The sum.
     */
    Long sum(final List<Integer> list) {
        final AtomicLong sum = new AtomicLong(0L);
        list.forEach(sum::addAndGet);
        return sum.get();
    }

    public static void main(String[] args) {
        final List<Integer> list = new ArrayList<>(3);
        list.add(3);
        list.add(0);
        list.add(3);
        System.out.println("Output: " + new LambdaDemo().max(list));
    }
}
