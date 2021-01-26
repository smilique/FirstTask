package com.epam.task.first.creator;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayParser {

    private StringParser parser = new StringParser();

    public List<Array> createArrayList (List<String> data) {

        List<Array> arrayList= new ArrayList<>();
        Array elements = new Array();

        for (int index = 0; index<data.size(); index++)  {
             elements = parser.createArray(data.get(index));
            arrayList.add(elements);
        }

        return arrayList;

    }
}
