package com.subha.test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by subhanjan on 16/04/2018.
 */
public class Solution {

    private static final String BLANK = "";


    public int countPairs(Long[] arrayOfNumbers, Long sum) {


        if (Stream.of(arrayOfNumbers).allMatch(number -> number > 0)) {
            List<Long> longList = Arrays.asList(arrayOfNumbers);

            Set<String> pairs =  Stream.of(arrayOfNumbers).map( number -> {
                Long diff = sum - number;
                if(longList.contains(diff)) {
                    Long[] pair = new Long[]{diff, number};
                    Arrays.sort(pair);
                    return pair[0] + BLANK + pair[1];
                }
                else
                    return null;

            }).filter(Objects::nonNull)
                    .collect(Collectors.toCollection(HashSet::new));
            return pairs.size();
        }
        return 0;
    }

}
