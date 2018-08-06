package com.testng.learn;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDemo1 {
    @Test
    @Parameters({"Browser" ,"Server"})
    public void test1(String browser, String server) {
        System.out.println("Hello");
        System.out.println("这次启动浏览器是： "+browser+" 测试服务器地址是： "+server);
    }
}
