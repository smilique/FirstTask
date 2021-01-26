package com.epam.task.first;

import com.epam.task.first.creator.ArrayParser;
import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import com.epam.task.first.creator.StringParser;
import com.epam.task.first.creator.StringValidator;

import java.util.List;

public class ArrayCreator {

    private DataReader dataReader;
    private StringValidator validator;
    private ArrayParser parser;

    public ArrayCreator(DataReader dataReader, StringValidator validator, ArrayParser parser) {
        this.dataReader = dataReader;
        this.validator = validator;
        this.parser = parser;
    }

    public List<Array> process(String filename) throws DataException {

        //read lines from file - DataReader
        //validate each line - ArrayValidator
        //for  each valid line create array - ArrayParser?
        //return result - ArraySorter?
         List<String> data = dataReader.readData(filename);
         List<Array> array = parser.createArrayList(data);

        return array;
    }

}
