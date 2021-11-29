package com.pavithra.model;

public class Employee {
    String firstName;
    String lastName;
    public String getfirstName(){
        return firstName;
    }

    public String getlastName(){
        return lastName;
    }

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public void setlaastName(String lastName){
        this.lastName = lastName;
    }

    public Employee(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}