package com.testng.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {
    @Test
    public void AssertTest() {
        String[] st1 = {"Anthony", "Tom", "Jhon"};
        String[] st2 = {"Jhon", "Anthony", "Tom"};
        Assert.assertFalse(st1 == st2, "两个相等");
    }
}
