package com.subha.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by if993886 on 18/04/2018.
 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void countPairsWhenArrayHasNegativeNumber(){
        Long[] arr = {1L, 9L, 1L, 35L, 30L, -20L};
        Long sum = 36L;
        Assert.assertEquals(0, solution.countPairs(arr, sum));
    }

    @Test
    public void countPairsPositive(){
        Long[] arr = {1L, 9L, 1L, 35L, 30L, 20L};
        Long sum = 36L;
        Assert.assertEquals(1, solution.countPairs(arr, sum));
    }

    @Test
    public void countPairsHasMultipleSameNumbers(){
        Long[] arr = {1L, 1L, 1L, 1L, 1L, 1L};
        Long sum = 2L;
        Assert.assertEquals(1, solution.countPairs(arr, sum));
    }

    @Test
    public void countPairsWhenSumDoesNotMatchWithNumbers(){
        Long[] arr = {1L, 1L, 1L, 1L, 1L, 1L};
        Long sum = 6L;
        Assert.assertEquals(0, solution.countPairs(arr, sum));
    }
}
