package com.seleniummaster.classconcept;

public class ProductContent {
    private String ProductName;
    private String ProductCode;

    public ProductContent() {
    }

    public ProductContent(String productName, String productCode) {
        this.ProductName = productName;
        this.ProductCode= productCode;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getProductCode() {
        return ProductCode;
    }
}
