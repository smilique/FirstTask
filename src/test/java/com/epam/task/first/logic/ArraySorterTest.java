package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArraySorterTest {

    private List<Array> array = new ArrayList<>();
    private List<Array> expected = new ArrayList<>();
    private ArraySorter sorter = new ArraySorter();

    @Before
    public void before() {
        array.add(new Array(78,15,75,-85,45,0,45,14));
        array.add(new Array(5,9,7,2,5,6,4));

        expected.add(new Array(-85,0,14,15,45,45,75,78));
        expected.add(new Array(2,4,5,5,6,7,9));
    }

    @Test
    public void testArraySorterShouldSortArrayByBubbleAlgo() throws SorterException {

        //given

        //when
        List<Array> actual = sorter.sort(array,"bubble");

        //then
        Assert.assertEquals(actual.toString(),expected.toString());
    }

    @Test
    public void testArraySorterShouldSortArrayByInjectionAlgo() throws SorterException{

        //given

        //when
        List<Array> actual = sorter.sort(array,"injection");

        //then
        Assert.assertEquals(actual.toString(),expected.toString());
    }

    @Test
    public void testArraySorterShouldSortArrayBySelectionAlgo() throws SorterException{

        //given

        //when
        List<Array> actual = sorter.sort(array,"selection");

        //then
        Assert.assertEquals(actual.toString(),expected.toString());
    }
}
