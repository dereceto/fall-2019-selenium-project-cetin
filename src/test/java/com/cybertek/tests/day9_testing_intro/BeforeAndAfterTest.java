package com.cybertek.tests.day9_testing_intro;

import org.testng.Assert;
import org.testng.annotations.*;

public class BeforeAndAfterTest {
    @BeforeClass
    public void beforeClass(){
        System.out.println("\tBEFORE CLASS");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("\t BEFORE METHOD");
    }

    @Test
    public void test2(){
        System.out.println("this is test two");
    }

    @Test
    public void test1(){
        System.out.println("this is test one");
        Assert.assertEquals(true,true);
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("\t AFTER METHOD");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("\tAFTER CLASS");
    }


}
