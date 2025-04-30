package com.zipcoder.cryptonator_api.domain;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Foo {
    @Id
    private String ticker; // e.g., BTC-USD
    private double price;
    private String base;
    private String target;
    private long timestamp;


    public String getTicker() { return ticker; }
    public void setTicker(String ticker) { this.ticker = ticker; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getBase() { return base; }
    public void setBase(String base) { this.base = base; }

    public String getTarget() { return target; }
    public void setTarget(String target) { this.target = target; }

    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long timestamp) { this.timestamp = timestamp; }
}
