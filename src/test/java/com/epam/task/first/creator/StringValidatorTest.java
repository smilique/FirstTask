package com.epam.task.first.creator;

import org.junit.Assert;
import org.junit.Test;

public class StringValidatorTest {

    @Test
    public void testStringValidatorShouldReturnTrueWhenStringIsValid() {

        //given
        boolean expected = true;

        //when
        StringValidator validator = new StringValidator();

        //then
        Assert.assertEquals(true,validator.validate("45 35 98"));
    }

    @Test
    public void testStringValidatorShouldReturnFalseWhenStringIsInvalid() {

        //given
        boolean expected = false;

        //when
        StringValidator validator = new StringValidator();

        //then
        Assert.assertEquals(false,validator.validate("45 35 98j"));
    }
}
