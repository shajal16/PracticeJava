package com.kamal.employee;

class Employee{
    private String name, address;
    private int year;
    public Employee(String n, int y, String add){
        name = n;
        year = y;
        address = add;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public String getAddress(){
        return address;
    }
}
