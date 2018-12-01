/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housingapp;

import java.io.Serializable;

/**
 *
 * @author Sandupa
 */
public class Mortgage extends Housing implements Serializable {

    private double mortgage_price;
    private int years;
    private double total;

    public Mortgage(double mortgage_price, int years, double total, String owner, String type, String county, int bedrooms, int bathrooms) {
        super(owner, type, county, bedrooms, bathrooms);
        this.mortgage_price = mortgage_price;
        this.years = years;
        this.total = total;
    }

    public Mortgage() {
        super();
        mortgage_price = 0.0;
        years = 0;
        total = 0.0;
    }

    public void setMortgage_price(double mortgage_price) {
        this.mortgage_price = mortgage_price;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getMortgage_price() {
        return mortgage_price;
    }

    public int getYears() {
        return years;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public void compute() {
        total = mortgage_price / years;
    }

    @Override
    public String printDetails() {
        return super.printDetails() + "\n Mortgage Price: €" + total + " years.";
    }
}
