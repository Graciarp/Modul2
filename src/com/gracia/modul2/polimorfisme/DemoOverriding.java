package com.gracia.modul2.polimorfisme;

public class DemoOverriding {
    public static void main(String[] args) {
        X supperClass = new X();
        Y subClass = new Y();

        supperClass.getValue("Tidur");
        subClass.getValue("Makan");
    }
}
