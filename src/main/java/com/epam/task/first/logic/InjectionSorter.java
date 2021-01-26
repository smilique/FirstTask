package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.Arrays;
import java.util.List;

public class InjectionSorter {

    public Array sort(Array array) {

        ArrayConvert convert = new ArrayConvert();
        Integer[] unsorted = convert.convertFrom(array);

        for (int index = 1; index < unsorted.length; index++) {
            int temp = unsorted[index];
            int counter = index - 1;
            while (counter >= 0 && temp < unsorted[counter]) {
                unsorted[counter+1] = unsorted[counter];
                counter--;
            }
            unsorted[counter+1] = temp;
        }

        Array sorted = convert.convertTo(unsorted);

        return sorted;
    }
}
