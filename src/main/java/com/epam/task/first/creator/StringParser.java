package com.epam.task.first.creator;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;


public class StringParser {

    private StringValidator validator = new StringValidator();

    public Array createArray(String data) {

        String currentNumber = "";
        List<Integer> elements = new ArrayList<>();
        if (validator.validate(data)) {
            for (int index = 0; index < data.length(); index++) {
                char currentSymbol = data.charAt(index);
                if (currentSymbol != ' ') {
                    currentNumber += currentSymbol;
                } else {
                    elements.add(Integer.parseInt(currentNumber));
                    currentNumber = "";
                }

            }
            elements.add(Integer.parseInt(currentNumber));

        }
        Array array = new Array(elements);
        return array;

    }
}
