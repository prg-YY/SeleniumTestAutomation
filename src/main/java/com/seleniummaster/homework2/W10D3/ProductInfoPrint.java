package com.seleniummaster.homework2.W10D3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductInfoPrint {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("mac", "pro2020", 1500));
        products.add(new Product("subaru impreza", "WRX STi 2.0", 20000));
        products.add(new Product("red bull", "250 ml", 200));

        for (Product s : products) {
            System.out.println(s.toString());


        }
        System.out.println();
        for (int i = 0; i < products.size(); i++) {
            //System.out.println(products.get(i).toString());
            products.get(i).setPrice(products.get(i).getPrice() - 50);
            System.out.println(products.get(i).toString());
        }
        System.out.println();
        for (int i = 0; i < products.size(); i++) {
            products.get(i).setPrice(products.get(i).getPrice()+100 );
            System.out.println(products.get(i).toString());


        }

    }

}

