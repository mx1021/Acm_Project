package com55;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import org.junit.Test;

public class CallableCase implements Callable<Object>
{
    int num = 100;

    @Override
    public Object call() throws Exception {
        while (num-- > 0) {
            System.out.println(Thread.currentThread().getName() + "->num=" + num);

        }
        return 10;
    }

    @Test
    public void mxTest10时53分() throws InterruptedException, ExecutionException {
        System.out.println("test----");
        FutureTask<?> futureTask1 = new FutureTask<Object>(new CallableCase());
        FutureTask<?> futureTask2 = new FutureTask<Object>(new CallableCase());

        Thread thread1 = new Thread(futureTask1);
        Thread thread2 = new Thread(futureTask2);

        thread2.start();

        futureTask2.get();

        thread1.start();

        futureTask1.get();
        //futureTask.isDone();
        //Object object = futureTask.get();
        //System.out.println(object);
    }

    @Test
    public void mxTest11时07分() {
        new Thread(new Runnable()
        {

            @Override
            public void run() {
                while (num > 0) {
                    System.out.println(Thread.currentThread().getName() + ":" + (num--));
                }

            }
        }).start();
        new Thread(new Runnable()
        {

            @Override
            public void run() {
                while (num > 0) {
                    System.out.println(Thread.currentThread().getName() + ":" + num--);
                }

            }
        }).start();
    }
}
