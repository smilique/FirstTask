package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

public class SelectionSorter {
    public Array sort(Array array) {

        ArrayConvert convert = new ArrayConvert();
        Integer[] unsorted = convert.convertFrom(array);

        for (int index = 0; index < unsorted.length; index++) {
            int min = unsorted[index];
            int minIndex = index;
            for (int counter = index+1; counter < unsorted.length; counter++) {
                if (unsorted[counter] < min) {
                    min = unsorted[counter];
                    minIndex = counter;
                }
            }
            int temp = unsorted[index];
            unsorted[index] = min;
            unsorted[minIndex] = temp;
        }

        Array sorted = convert.convertTo(unsorted);

        return sorted;
    }

}
