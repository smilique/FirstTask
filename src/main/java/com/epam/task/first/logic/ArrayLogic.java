package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayLogic {

    public Integer findMax(Array array) {
        List<Integer> elements = array.getElements();
        int max = elements.get(0);

        for (Integer element : elements) {
            if (element > max) {
                max = element;
            }
        }

        return max;

    }

    public Integer findMin(Array array) {
        List<Integer> elements = array.getElements();
        int min = elements.get(0);

        for (Integer element : elements) {
            if (min > element) {
                min = element;
            }
        }

        return min;
    }

    public Array changeElementsByCondition(Array array) {

        /*
         * Condition:
         * double positive number
         * triple negative number
         * zero - don't change
         */

        List<Integer> elements = array.getElements();
        List<Integer> changedElements = new ArrayList<Integer>();

        for (Integer element : elements) {
            if (element > 0) {
                changedElements.add(element * 2);
            } else
                if (element < 0) {
                    changedElements.add(element * 3);
                } else {
                    changedElements.add(element);
                }

        }

        return new Array(changedElements);
    }

    public float findAverage(Array array) {

        List<Integer> elements = array.getElements();
        int elementsCount = elements.size();
        float elementSum = findSum(array);
        float average = elementSum / elementsCount;

        return average;
    }

    public Integer findSum(Array array) {
        List<Integer> elements = array.getElements();
        int elementSum = 0;

        for (Integer element : elements) {
            elementSum += element;
        }

        return elementSum;
    }

    public Integer findPositiveCount(Array array) {
        List<Integer> elements = array.getElements();
        int positiveNumbersCount = 0;

        for (Integer element : elements) {
            if (element > 0) {
                positiveNumbersCount++;
            }
        }

        return positiveNumbersCount;
    }

    public Integer findNegativeCount(Array array) {
        List<Integer> elements = array.getElements();
        int negativeNumbersCount = 0;

        for (Integer element : elements) {
            if (element < 0) {
                negativeNumbersCount++;
            }
        }

        return negativeNumbersCount;
    }

}
