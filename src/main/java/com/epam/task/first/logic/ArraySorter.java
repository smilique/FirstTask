package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;


public class ArraySorter {

    public List<Array> sort (List<Array> array, String sortAlgo) throws SorterException {

        List<Array> sortedArray = new ArrayList<>();
        switch (sortAlgo) {
            case "bubble": {
                BubbleSorter sorter = new BubbleSorter();
                for (Array element : array) {
                    sortedArray.add(sorter.sort(element));
                }
                return sortedArray;
            }
            case "injection": {
                InjectionSorter sorter = new InjectionSorter();
                for (Array element : array) {
                    sortedArray.add(sorter.sort(element));
                }
                return sortedArray;
            }
            case "selection": {
                SelectionSorter sorter = new SelectionSorter();
                for (Array element : array) {
                    sortedArray.add(sorter.sort(element));
                }
                return sortedArray;
            }

            default: {
                throw new SorterException();
            }
        }

    }
}
