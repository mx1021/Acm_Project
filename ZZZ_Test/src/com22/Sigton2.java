package com22;

public class Sigton2
{
    private Sigton2() {
    }

    private static Sigton2 sigton2;

    public static Sigton2 getInstance() {
        if (sigton2 == null) {
            sigton2 = new Sigton2();
        }
        return sigton2;
    }
}
