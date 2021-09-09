package com.seleniummaster.homework2.sprint3;

public class CubeCartInfo {
    private String productName;
    private String productCode;
    private String productWeight;
    private String productCondition;
    private String retailPrice;
    private String salePrice;
    private String costPrice;

    public CubeCartInfo() {
    }

    public CubeCartInfo(String productName, String productCode, String productWeight, String productCondition,
                        String retailPrice, String salePrice, String costPrice) {
        this.productName = productName;
        this.productCode = productCode;
        this.productWeight = productWeight;
        this.productCondition = productCondition;
        this.retailPrice = retailPrice;
        this.salePrice = salePrice;
        this.costPrice = costPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public String getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(String retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }
}
