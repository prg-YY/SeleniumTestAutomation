package com.seleniummaster.classconcept.pacjage2;

import com.seleniummaster.classconcept.package1.Alpha;

public class AlphaSub extends Alpha {
    //alpha class -paren class alphasub --child class
    public static void main(String[] args) {
        AlphaSub sub=new AlphaSub();
        sub.setInfo("Alpha class");
        System.out.println(sub.getInfo());
    }

}
