package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
       Set<String>set = new HashSet<>();

        for (String element : firstSet) {
            if(secondSet.contains(element)&& !thirdSet.contains(element)){
                set.add(element);
            }
        }
        for (String element : thirdSet) {
            if(!firstSet.contains(element)&& !secondSet.contains(element)){
                set.add(element);
            }
        }
        return set;
    }
}
