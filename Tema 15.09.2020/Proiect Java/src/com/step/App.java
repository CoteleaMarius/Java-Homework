package com.step;
import java.util.Scanner;

import com.step.calculator.Calculator;
import com.step.converter.TempConverter;
import com.step.comparator.NumbersComparator;
public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TempConverter obj = new TempConverter();
        System.out.print("Introdu valoarea gradelor in celsius: ");
        System.out.println(obj.convertToFahr(sc.nextDouble()));
        System.out.println("Introdu valoarea gradelor in fahrenheit: ");
        System.out.println(obj.convertToCelsius(sc.nextDouble()));
        Calculator calc = new Calculator();
        System.out.println("Adunarea: "); System.out.println(calc.add(sc.nextFloat(),sc.nextFloat()));
        System.out.println("Scaderea: "); System.out.println(calc.deduct(sc.nextFloat(),sc.nextFloat()));
        System.out.println("Inmultirea: "); System.out.println(calc.multiply(sc.nextFloat(),sc.nextFloat()));
        System.out.println("Impartirea: "); System.out.println(calc.division(sc.nextFloat(),sc.nextFloat()));
        NumbersComparator num = new NumbersComparator();
        System.out.println("Introdu 2 numere: ");
        num.comparare(sc.nextInt(), sc.nextInt());
    }
}