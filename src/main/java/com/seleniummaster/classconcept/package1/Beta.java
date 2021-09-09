package com.seleniummaster.classconcept.package1;

public class Beta {
    public static void main(String[] args) {
        Alpha a1=new Alpha();
        a1.setInfo("beta calss");
        System.out.println(a1.getInfo());


    }
    private String version;

    public Beta() {
    }

    public Beta(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
