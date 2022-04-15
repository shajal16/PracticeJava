package com.kamal.Task66;

public class Programming {
    String str = "I Love" ;

    public Programming(){
        this.str = this.str+ " Programming Languages";
    }

    public Programming(String str)
    {
        this.str = this.str +" "+ str;
    }

    public void printing(){
        System.out.println(str);
    }
}
