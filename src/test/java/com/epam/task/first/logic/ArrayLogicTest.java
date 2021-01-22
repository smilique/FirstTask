package com.epam.task.first.logic;

import com.epam.task.first.logic.entities.Array;
import com.epam.task.first.logic.logic.ArrayLogic;
import org.junit.Assert;
import org.junit.Test;

public class ArrayLogicTest {


    private ArrayLogic arrayLogic = new ArrayLogic();


    //testFindMax from here
    @Test
    public void testFindMaxShouldFindMaxWhenPositiveNumbersApplied(){
        //given
        Array array = new Array(1,3,2);

        //when
        int actual = arrayLogic.findMax(array);

        //then
        Assert.assertEquals(3,actual);

    }

    @Test
    public void testFindMaxShouldFindMaxWhenNegativeNumbersApplied(){
        //given
        Array array = new Array(-1,-3,-2);

        //when
        int actual = arrayLogic.findMax(array);

        //then
        Assert.assertEquals(-1,actual);
    }


    //testFindMin from here
    @Test
    public void testFindMinShouldFindMinWhenPositiveNumbersApplied(){
        //given
        Array array = new Array(1,3,2);

        //when
        int actual = arrayLogic.findMin(array);

        //then
        Assert.assertEquals(1,actual);

    }

    @Test
    public void testFindMinShouldFindMinWhenNegativeNumbersApplied(){
        //given
        Array array = new Array(-1,-3,-2);

        //when
        int actual = arrayLogic.findMin(array);

        //then
        Assert.assertEquals(-3,actual);
    }

    //testChangeElementsByCondition from here
    @Test
    public void testChangeElementsByConditionShouldDoubleValueWhenPositiveNumberFound(){
        //given
        Array array = new Array(1,2,3);

        //when
        Array result = arrayLogic.changeElementsByCondition(array);

        //then
        Assert.assertEquals(new Array<Integer>(2,4,6).getElements(),result.getElements());

    }

    @Test
    public void testChangeElementsByConditionShouldTripleValueWhenNegativeNumberFound(){
        //given
        Array array = new Array(-1,-2,-3);

        //when
        Array result = arrayLogic.changeElementsByCondition(array);

        //then
        Assert.assertEquals(new Array<Integer>(-3,-6,-9).getElements(),result.getElements());
    }

    @Test
    public void testChangeElementsByConditionShouldNotChangeNumberWhenZeroNumberFound(){
        //given
        Array array = new Array(-1,0,3);

        //when
        Array result = arrayLogic.changeElementsByCondition(array);

        //then
        Assert.assertEquals(new Array<Integer>(-3,0,6).getElements(),result.getElements());
    }


    //testFindAverage from here
    @Test
    public void testFindAverageShouldFindAverageWhenPositiveNumbersApplied(){
        //given
        Array array = new Array(5,4,6);

        //when
        float actual = arrayLogic.findAverage(array);

        //then
        Assert.assertEquals(5,actual,0.1);
    }

    @Test
    public void testFindAverageShouldFindAverageWhenNegativeNumbersApplied(){
        //given
        Array array = new Array(-5,-4,-6);

        //when
        float actual = arrayLogic.findAverage(array);

        //then
        Assert.assertEquals(-5,actual,0.1);
    }

    @Test
    public void testFindAverageShouldFindAverageWhenMixedNumbersApplied(){
        //given
        Array array = new Array(-5,0,8);

        //when
        float actual = arrayLogic.findAverage(array);

        //then
        Assert.assertEquals(1,actual,0.1);
    }

    @Test
    public void testFindAverageShouldFindAverageWhenFloatResultFound(){
        //given
        Array array = new Array(5,4,6,7);

        //when
        float actual = arrayLogic.findAverage(array);

        //then
        Assert.assertEquals(5.5,actual,0.1);
    }



    //testFindSum from here
    @Test
    public void testFindSumShouldFindSumWhenPositiveNumbersApplied(){
        //given
        Array array = new Array(1,2,3);

        //when
        int actual = arrayLogic.findSum(array);

        //then
        Assert.assertEquals(6,actual);
    }

    @Test
    public void testFindSumShouldFindSumWhenNegativeNumbersApplied(){
        //given
        Array array = new Array(-5,-7,-1);

        //when
        int actual = arrayLogic.findSum(array);

        //then
        Assert.assertEquals(-13,actual);
    }

    @Test
    public void testFindSumShouldFindSumWhenMixedNumbersApplied(){
        //given
        Array array = new Array(60,0,-31);

        //when
        int actual = arrayLogic.findSum(array);

        //then
        Assert.assertEquals(29,actual);
    }


    //testFindPositiveCount from here
    @Test
    public void testFindPositiveCountShouldFindPositiveNumbersCountWhenOnlyPositiveNumbersIncluded(){
        //given
        Array array = new Array(1,2,7);

        //when
        int actual = arrayLogic.findPositiveCount(array);

        //then
        Assert.assertEquals(3,actual);
    }

    @Test
    public void testFindPositiveCountShouldFindPositiveNumbersCountWhenZeroNumbersIncluded(){
        //given
        Array array = new Array(1,0,7);

        //when
        int actual = arrayLogic.findPositiveCount(array);

        //then
        Assert.assertEquals(2,actual);
    }

    @Test
    public void testFindPositiveCountShouldFindPositiveNumbersCountWhenNegativeNumbersIncluded(){
        //given
        Array array = new Array(-1,2,-7);

        //when
        int actual = arrayLogic.findPositiveCount(array);

        //then
        Assert.assertEquals(1,actual);
    }

    @Test
    public void testFindPositiveCountShouldNotFindPositiveNumbersWhenOnlyNegativeNumbersIncluded(){
        //given
        Array array = new Array(-1,-2,-7);

        //when
        int actual = arrayLogic.findPositiveCount(array);

        //then
        Assert.assertEquals(0,actual);
    }

    @Test
    public void testFindPositiveCountShouldNotFindPositiveNumbersWhenOnlyZeroNumbersIncluded(){
        //given
        Array array = new Array(0,0,0);

        //when
        int actual = arrayLogic.findPositiveCount(array);

        //then
        Assert.assertEquals(0,actual);
    }


    //testFindNegativeCount from here
    @Test
    public void testFindNegativeCountShouldFindNegativeNumbersCountWhenOnlyNegativeNumbersIncluded(){
        //given
        Array array = new Array(-1,-2,-7);

        //when
        int actual = arrayLogic.findNegativeCount(array);

        //then
        Assert.assertEquals(3,actual);
    }

    @Test
    public void testFindNegativeCountShouldFindNegativeNumbersCountWhenPositiveNumbersIncluded(){
        //given
        Array array = new Array(-1,2,-7);

        //when
        int actual = arrayLogic.findNegativeCount(array);

        //then
        Assert.assertEquals(2,actual);
    }

    @Test
    public void testFindNegativeCountShouldFindNegativeNumbersCountWhenZeroNumbersIncluded(){
        //given
        Array array = new Array(0,-2,-7);

        //when
        int actual = arrayLogic.findNegativeCount(array);

        //then
        Assert.assertEquals(2,actual);
    }

    @Test
    public void testFindNegativeCountShouldNotFindNegativeNumbersWhenOnlyPositiveNumbersIncluded(){
        //given
        Array array = new Array(4,2,7);

        //when
        int actual = arrayLogic.findNegativeCount(array);

        //then
        Assert.assertEquals(0,actual);
    }

    @Test
    public void testFindNegativeCountShouldNotFindNegativeNumbersWhenOnlyZeroNumbersIncluded(){
        //given
        Array array = new Array(0,0,0);

        //when
        int actual = arrayLogic.findNegativeCount(array);

        //then
        Assert.assertEquals(0,actual);
    }
}
