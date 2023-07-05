package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer>squareSet = new TreeSet<>();
        for (Integer number : sourceList) {
            int res =number*number;
            squareSet.add(res);
        }
        return squareSet.subSet(lowerBound, true, upperBound, true);

    }
}
