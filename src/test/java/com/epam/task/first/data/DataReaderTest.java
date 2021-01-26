package com.epam.task.first.data;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DataReaderTest {

    private final String  TEST_DATA = "./src/test/resources/input.txt";
    private final List<String> expected = new ArrayList<>();
    private DataReader reader = new DataReader();

    @Before
    public void before(){
        expected.add("1 8 68 -54 878 0 -78 11 2 2 -5");
        expected.add("4 f 4 1");
        expected.add("9 5 9 54");
    }

    @Test
    public void testDataReaderShouldReadDataFromFileInSrc() throws DataException {

        //given

        //when
        List<String> actual = reader.readData(TEST_DATA);

        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testDataReaderShouldReadDataFromExternalFile() throws DataException {

        //given

        //when
        List<String> actual = reader.readData("C:/temp/input.txt");

        //actual
        Assert.assertEquals(expected,actual);
    }


}
