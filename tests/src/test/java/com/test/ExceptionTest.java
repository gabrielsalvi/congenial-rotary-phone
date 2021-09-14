package com.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class ExceptionTest
{
    // o teste irá falhar, pois o método espera uma exceção
    @Test(expected = IndexOutOfBoundsException.class)
    public void empty()
    {
        List<String> list = new ArrayList<>();

        list.add("Test");
        list.get(0);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldTestExceptionMessage() throws IndexOutOfBoundsException
    {
        List<Object> list = new ArrayList<>();

        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Index 0 out of bounds for length 0");

        list.get(0);
    }

    @Test
    public void testExceptionMessage()
    {
        try
        {
            new ArrayList<Object>().get(0);
            fail("Expecting an IndexOutOfBoundsException");
        }
        catch (IndexOutOfBoundsException exception)
        {
            assertThat(exception.getMessage(), is("Index 0 out of bounds for length 0"));
        }
    }
}
