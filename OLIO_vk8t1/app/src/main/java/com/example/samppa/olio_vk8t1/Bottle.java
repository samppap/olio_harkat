package com.example.samppa.olio_vk8t1;

class Bottle {

    private String bottleName;
    private String manufacturer;
    private double total_energy;
    private double bottleSize;
    private double bottlePrize;

    public Bottle() {
        bottleName = "Pepsi Max";
        manufacturer = "Pepsi";
        total_energy = 0.3;
        bottleSize = 0.5;
        bottlePrize = 1.80;
    }

    public String getName() {
        return bottleName;
    }

    public double getPrice() {
        return bottlePrize;
    }

    public double getSize() {
        return bottleSize;
    }

}