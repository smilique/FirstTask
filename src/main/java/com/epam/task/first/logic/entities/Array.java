package com.epam.task.first.logic.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array<T> {

    private final List<Integer> elements;

    public Array(Integer... elements){
        this.elements = new ArrayList<Integer>();
        this.elements.addAll(Arrays.asList(elements));
    }
    public Array(List<Integer> elements) {
        this.elements = elements;
    }

    public List<Integer> getElements(){
        return elements;
    }
}
