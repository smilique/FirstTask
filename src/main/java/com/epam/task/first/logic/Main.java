package com.epam.task.first.logic;

import com.epam.task.first.logic.entities.Array;
import com.epam.task.first.logic.view.ArrayPrinter;
import com.epam.task.first.logic.view.ConsoleArrayPrinter;

public class Main {

    public static void main(String[] args) {


        Array array = new Array(1,2,3);
        ArrayPrinter printer = new ConsoleArrayPrinter();

        printer.print(array);


    }

}
