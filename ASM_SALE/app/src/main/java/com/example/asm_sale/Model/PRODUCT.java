package com.example.asm_sale.Model;



public class PRODUCT {
    private String nameproduct;
    private String priceproduct;
    private String description;
    private String img_product;

    public PRODUCT() {
    }

    public PRODUCT(String nameproduct, String priceproduct, String description, String img_product) {
        this.nameproduct = nameproduct;
        this.priceproduct = priceproduct;
        this.description = description;
        this.img_product = img_product;
    }

    public String getNameproduct() {
        return nameproduct;
    }

    public void setNameproduct(String nameproduct) {
        this.nameproduct = nameproduct;
    }

    public String getPriceproduct() {
        return priceproduct;
    }

    public void setPriceproduct(String priceproduct) {
        this.priceproduct = priceproduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg_product() {
        return img_product;
    }

    public void setImg_product(String img_product) {
        this.img_product = img_product;
    }
}
