package com.test.demo11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(new RunnableImpl());
        service.submit(new RunnableImpl());
        service.submit(new RunnableImpl());
    }
}
