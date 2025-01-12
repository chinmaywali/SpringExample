package com.example.autowire.type;

public class car {
    private Specification specification;

    public void setSpecification(Specification specification) { // remove constructor and add setter
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car Details : "+specification.toString());
    }
}
