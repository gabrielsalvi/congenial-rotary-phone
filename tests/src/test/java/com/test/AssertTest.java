package com.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest
{
    @Test
    public void testAssertArrayEquals()
    {
        byte[] expected = "test".getBytes();
        byte[] current = "test".getBytes();

        assertArrayEquals(expected, current);
    }

    @Test
    public void testAssertEquals()
    {
        assertEquals("text", "text");
    }

    @Test
    public void testAssertFalse()
    {
        assertFalse(false);
    }

    @Test
    public void testAssertNotNull()
    {
        assertNotNull(new Object());
    }

    @Test
    public void testAssertNotSame() {
        assertNotSame(new Object(), new Object());
    }

    @Test
    public void testAssertNull() {
        assertNull(null);
    }
}
