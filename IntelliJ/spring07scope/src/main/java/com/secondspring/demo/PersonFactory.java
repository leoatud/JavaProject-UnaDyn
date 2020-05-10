package com.secondspring.demo;

public class PersonFactory {

    //static method
    public static Person createPerson(){
        System.out.println("static method to create new person");
        return new Person();
    }

    public Person createPerson2(){
        System.out.println("dynamic method to create new person");
        return new Person();
    }
}
