package com.kamal.Task64;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle()
    {
        int length = 0;
        int breadth = 0;

    }

    public Rectangle(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(int length)
    {
        this.length = length ;
        this.breadth = length;

    }

    public void  printing()
    {
        System.out.println(length*breadth);
    }
}
