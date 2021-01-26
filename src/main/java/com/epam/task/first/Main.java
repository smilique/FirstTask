package com.epam.task.first;

import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.view.ArrayPrinter;
import com.epam.task.first.view.ConsoleArrayPrinter;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import static com.epam.task.first.data.DataReader.readData;

public class Main {

    public static void main(String[] args) {


        Array array = new Array(1,2,3);
        ArrayPrinter printer = new ConsoleArrayPrinter();

        printer.print(array);
        //delete from here


    }


}
