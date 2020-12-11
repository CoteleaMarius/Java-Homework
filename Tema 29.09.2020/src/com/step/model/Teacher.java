package com.step.model;
import com.step.model.Person;
public class Teacher extends Person{
    String subject;
    public void grading(){
        System.out.println("The teacher is grading the tests");
    }
    public void teaching(){
        System.out.println("The teacher is teaching mathematics");
    }
}
