package com.step.model;
import com.step.model.Person;
public class Doctor extends Person{
String rank;
public void operating(){
    System.out.println("The doctor is performing an operation");
}
public void diagnosing(){
    System.out.println("The doctor is administrating a diagnose");
}
}
