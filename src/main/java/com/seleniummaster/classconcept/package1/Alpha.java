package com.seleniummaster.classconcept.package1;

public class Alpha {
    public static void main(String[] args) {
        Alpha a1=new Alpha();
        a1.info="Alpha class";
        System.out.println(a1.info);



    }
    private String info;

    public Alpha() {
    }

    public Alpha(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
