package com.eu.sati.tests;

import org.junit.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class CalcTest {

    Calc calc;

    @BeforeClass
    public void setUp() {
        calc = new Calc();
    }



    @Test
    public void testAdd() {
        Assert.assertEquals(4,calc.add(2,2));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(4,calc.subtract(6,2));

    }

    @Test
    public void testDivide() {
        Assert.assertEquals(4,calc.divide(8,2),0);

    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(4,calc.add(2,2));
    }

    @AfterClass
    public void tearDown() {
    }
}