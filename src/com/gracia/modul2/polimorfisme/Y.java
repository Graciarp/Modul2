package com.gracia.modul2.polimorfisme;

public class Y extends X{
    @Override
    public void getValue(String value) {
        super.getValue(value);
        System.out.println("Value class Y : "+ value);
    }
}
