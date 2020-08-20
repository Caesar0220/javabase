package com.test.demo12;

public class Demo03Caculator {
    public static void main(String[] args) {
        int result = invokeCalc(100, 300, (a, b) -> a + b);
        System.out.println(result);
    }

    public static int invokeCalc(int a, int b, Caculator caculator) {
        return caculator.calc(a, b);
    }
}
