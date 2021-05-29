package com.company;

public class Main {
    public static void main(String[] args) {
        customer c1 = new customer("Beso","a1b2c3","Matcha");
        customer c2 = new customer("JSpaco","abc123","Matcha");
        customer c3 = new customer("Long","123abc","Matcha");
        barista b1 = new barista("Drake");
        b1.add(c1);
        b1.add(c2);
        b1.add(c3);

        c3.buy();
        c3.spBuy(3);

        b1.getInfo("fever");
        b1.getInfo("123abc");

        c3.usingCP();
        c2.usingCP();
        b1.getInfo("123abc");
    }
}
