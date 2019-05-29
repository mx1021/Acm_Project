package com55;

import java.awt.Label;

import org.junit.Test;

public class ThreasTes
{

    synchronized void a() throws InterruptedException {
        Thread.sleep(10000);
    }

    synchronized void b() throws InterruptedException {
        Thread.sleep(10000);
    }

    @Test
    public void mxTest13时46分() {
        int a = 5;
        switch (a) {
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
            default:
                System.out.println("0");
        }
    }

    @Test
    public void mxTest14时13分() {
        flas: for (int i = 0; i < 10; i++) {
            System.out.println(i);
            for (int j = 0; j < 10; j++) {
                System.out.println(j);
                if (j == 5) {
                    break flas;
                }
            }
        }
    }
}
