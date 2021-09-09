package com.seleniummaster.UighurIT;

public class day13Torbiket {
    public static void main(String[] args) {
        //torbiket=www.UyghurIt.com
        //manbe= BIZ togrisida sual sorag
        //output: www.UyghurIt.com/biz_togrisida_sual_sorag

        String torbiket="www.UyghurIt.com";
        String menbe=" bIZ togrisida sual sorag ";
        String yantu="/";


        menbe=menbe.trim();
        menbe=menbe.toLowerCase();
        menbe=yantu.concat(menbe);
        menbe=menbe.replace(" ","_");
        String output=torbiket.concat(menbe);
        System.out.println("Output: "+output);
    }
}
