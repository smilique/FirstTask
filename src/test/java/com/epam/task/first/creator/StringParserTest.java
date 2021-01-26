package com.epam.task.first.creator;

import com.epam.task.first.entities.Array;
import org.junit.Test;

public class StringParserTest {

    @Test
    public void testArrayParserShouldReturnArrayFromValidString() {

        //given
        Array expected = new Array(1,45,-9,50);

        //when
        StringParser parser = new StringParser();

        //then
        parser.createArray("1 45 -9 50");
    }
}
