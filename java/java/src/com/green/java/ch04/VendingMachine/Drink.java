package com.green.java.ch04.VendingMachine;

public class Drink {
    private int price;
    private String nm;
    private String company;
    private int ml;

    public Drink() {
    }

    Drink(int pirce, String nm, String company, int ml){
        this.price = pirce;
        this.nm = nm;
        this.company = company;
        this.ml = ml;
    }

    public int getPrice() {
        return price;
    }

    public String getNm() {
        return nm;
    }

    public String getCompany() {
        return company;
    }

    public int getMl() {
        return ml;
    }
}
