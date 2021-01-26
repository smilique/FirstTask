package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.Arrays;
import java.util.List;

public class ArrayConvert {

    public Integer[] convertFrom(Array array) {
        List<Integer> elements = array.getElements();
        Integer[] converted = new Integer[elements.size()];

        int counter = 0;
        for (Integer element : elements) {
            converted[counter] = element;
            counter++;
        }

        return converted;
    }

    public Array convertTo(Integer[] array) {

        List<Integer> sortedElements = Arrays.asList(array.clone());
        Array outputArray = new Array(sortedElements);

        return outputArray;
    }
}
