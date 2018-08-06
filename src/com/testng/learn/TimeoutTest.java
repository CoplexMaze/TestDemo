package com.testng.learn;

import org.testng.annotations.Test;

public class TimeoutTest {
    @Test(timeOut = 3000)
    public void loginTest() {
        try{
            Thread.sleep(2900);
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
    }
}
