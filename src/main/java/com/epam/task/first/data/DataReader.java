package com.epam.task.first.data;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;


import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public static boolean readData;

    public List<String> readData(String filename) throws DataException {
        final char endOfLine = '\r';
        List<String> data = new ArrayList<>();

        try (FileReader fileReader = new FileReader(filename)){
            StringBuffer buffer = new StringBuffer();

            while (fileReader.ready()) {
                char element = (char) fileReader.read();
                if (element == endOfLine) {
                    data.add(buffer.toString());
                    buffer = new StringBuffer();
                    fileReader.read();
                } else {
                    buffer.append(element);
                }
            }
            if (buffer.length() > 0) {
               data.add(buffer.toString());
            }
        } catch (IOException e) {
            throw new DataException(e.getMessage(),e);
        }
        return data;
    }

}
