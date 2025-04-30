package com.zipcoder.cryptonator_api;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Foo {
    @Id
    private String ticker; // example: "btc-usd"
    private double price;

    public Foo() {}

    public Foo(String ticker, double price) {
        this.ticker = ticker;
        this.price = price;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
