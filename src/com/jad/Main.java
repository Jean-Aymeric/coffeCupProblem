package com.jad;

public class Main {

    public static void main(String[] args) {
        CoffeeCup myCoffeeCup = new CoffeeCup();
        myCoffeeCup.setLiquid(new Coffee());
        System.out.println(myCoffeeCup);
        myCoffeeCup.setLiquid(new BlackTea());
        System.out.println(myCoffeeCup);
    }
}
