package com.kamal.Task61;

public class Complex {
    int real = 0;
    int img = 0;

    public Complex(int r, int i){
        real = r;
        img = i;
    }
    public static Complex add (Complex a, Complex b){
        return new Complex((a.real + b.real), (a.img + b.img));
    }
    public static Complex subs(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.img - b.img));
    }
    public static Complex prod(Complex a, Complex b){
        int t = (a.real*b.real)-(a.img*b.img);
        int n = (a.real*b.img) - (a.img*b.img);
        return new Complex(t,n);
    }
    public void printing(){
        if(real == 0){
            System.out.println(img+"i");
        }
        else if(img == 0){
            System.out.println(real);
        }else{
            System.out.print(real+ " + " + img +"i\n");
        }
    }
}
