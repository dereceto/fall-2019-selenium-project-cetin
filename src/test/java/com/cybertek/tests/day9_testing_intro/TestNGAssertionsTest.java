package com.cybertek.tests.day9_testing_intro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsTest {

    @Test
    public void test1(){
        String  expected ="one";
        String actual ="one";
        Assert.assertEquals(actual,expected);
        Assert.assertEquals(4,4);
        Assert.assertEquals(true,true);

    }

    @Test
    public void test2(){
        String  expected ="one";
        String actual ="two";
        System.out.println("Starting to compare");
        Assert.assertEquals(actual,expected);
        System.out.println("test 2 complete");
    }

    @Test
    public void test3(){
        String  expected ="one";
        String actual ="two";
        Assert.assertNotEquals(expected,actual);
        Assert.assertNotEquals(3,9);
    }

    @Test
    public void test4(){
        String  expected ="one";
        String actual ="one";
        Assert.assertTrue(expected.equalsIgnoreCase(actual));

        int a=100;
        int b=200;
        Assert.assertTrue(a>b);
    }

    @Test
    public void test5(){
        // Verify that URL is EQUAL to https://www.google.com/
        String expected = "https://www.google.com/";
        String actual = "https://www.google.com/";
        Assert.assertEquals(expected,actual);

        // Verify that title starts with java

        String expected1="java";
        String actual1 = "java - Google Search";
        Assert.assertTrue(actual1.contains(expected1));
        Assert.assertTrue(actual1.startsWith(expected1));
    }
}
