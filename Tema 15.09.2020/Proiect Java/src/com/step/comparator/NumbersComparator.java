package com.step.comparator;

public class NumbersComparator {
    public void comparare(int nr1, int nr2) {
        if (nr1 < nr2) {
            System.out.println("Numarul 1 este mai mic decat numarul 2");
        } else if (nr1 == nr2) { System.out.println("Numerele sunt egale"); }
    else { System.out.println("Numarul 1 este mai mare decat numarul 2"); }
    }
}