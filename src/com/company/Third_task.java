package com.company;

public class Third_task {
    public static void main(String[] args) {
        double a,b,c,d,e;
        a=14.44;
        b=a-a%10;
        c=(a-b)-(a-b)%1;
        d=(a-b)%1;
        e=b+c;
        int f =(int)e;
        System.out.println("Число="+a);
        System.out.println("Заокруглене число="+(f));


    }
}
