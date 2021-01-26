package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.Arrays;
import java.util.List;

public class BubbleSorter {

    public Array sort(Array array) {

        ArrayConvert convert = new ArrayConvert();
        Integer[] unsorted = convert.convertFrom(array);

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int index = 0; index < unsorted.length - 1; index++) {
                if (unsorted[index] > unsorted[index+1]) {
                    int temp = unsorted[index];
                    unsorted[index] = unsorted[index+1];
                    unsorted[index+1] = temp;
                    isSorted = false;
                }
            }
        }

        Array sorted = convert.convertTo(unsorted);

            return sorted;

        }
    }




