package com.seleniummaster.Excersice.writetofile;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileWriteDemo3EX1 {
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer();
        buffer.append("#siteurl\nqa=123\nmaharaurl=http://mahara.unitedcoderschool.com/mahara/\nmaharaurl1=https://mahara.org/" +
                "\n#userinfo\nusername=yusufyakup\npassword=!@#A12345prg\ntimeout=100");
//        buffer.append("qa=1");
//        buffer.append("") ;
        File file=new File("last EX"+File.separator+"mahara.properties");
        try {
            FileUtils.writeStringToFile(file,buffer.toString(),true);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
