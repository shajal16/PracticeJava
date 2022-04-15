package com.kamal.Task65;

class AddAmount{
    private int amount = 50;

    public AddAmount()
    {

    }

    public AddAmount(int am)
    {
        amount = am+amount;
    }

    public void finalAmount()
    {
        System.out.println(amount);
    }
}
