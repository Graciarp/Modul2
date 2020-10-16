package com.gracia.modul2.Inheritance;

//class A sebagai super class
public class A {
    //inisiasi variable harus menggunakan public atau protected supaya dapat diakses
    public int x;
    public int y;

    //method void untuk mencetak x dan y
    public void printXY(){
        System.out.println("Nilai x\t: "+x);
        System.out.println("Nilai y\t: "+y);
    }
}
