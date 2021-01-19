package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
   List<Integer> evenNumbers = new LinkedList<>();

    public List<Integer> exterminate(List<Integer> numbers) {
        for(int i : numbers) {
            if(i%2 == 0) {
                evenNumbers.add(i);
            }
        }
       return evenNumbers;
    }
}
