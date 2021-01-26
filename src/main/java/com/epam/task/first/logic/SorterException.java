package com.epam.task.first.logic;

public class SorterException extends Exception {

    public SorterException(){
        System.out.println((char)27 + "[31m" + "Unknown sorter algo!");
    }
}
