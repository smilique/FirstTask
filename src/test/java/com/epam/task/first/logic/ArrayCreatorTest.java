package com.epam.task.first.logic;


import com.epam.task.first.ArrayCreator;
import com.epam.task.first.creator.ArrayParser;
import com.epam.task.first.creator.StringValidator;
import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ArrayCreatorTest {

    private List<String> data = new ArrayList<>();
    private List<Array> returnable = new ArrayList<>();
    private List<Array> expected = new ArrayList<>();

        @Before
        public void before() {
            data.add("5 -78 3");
            data.add("34 44 4");

            returnable.add(new Array(1,8,68,-54,878,0,-78,11,2,2,-5));
            returnable.add(new Array(9,5,9,54));

            expected.add(new Array(1,8,68,-54,878,0,-78,11,2,2,-5));
            expected.add(new Array(9,5,9,54));
        }
    @Test
    public void testArrayCreatorShouldCreateArray() throws DataException {
        //given
        final  List<String> TEST_DATA = Arrays.asList("5 -78 3", "34 44 4");

        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readData(anyString())).thenReturn(TEST_DATA);

        StringValidator validator = Mockito.mock(StringValidator.class);
        when(validator.validate(anyString())).thenReturn(Boolean.TRUE);

        ArrayParser parser = Mockito.mock(ArrayParser.class);
        when(parser.createArrayList(data)).thenReturn(returnable);

        ArrayCreator creator = new ArrayCreator(reader,validator,parser);

        //when
        List<Array> actual = creator.process("");

        //then
        Assert.assertEquals(expected.toString(),actual.toString());

    }




}
