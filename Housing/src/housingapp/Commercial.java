/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housingapp;

import java.io.Serializable;

/**
 *
 * @author hemant
 */
public class Commercial extends Housing implements Serializable {
    private double minm;
    private double maxm;
    private double tax;
    private double value;
    private String fsale;
    
    //Overloaded constructor with housing parameters
    public Commercial(String owner, String type, String county, int bedrooms, int bathrooms, double minm, double maxm, double tax, double value,String fsale){
        super(owner,type,county,bedrooms,bathrooms);
        this.fsale=fsale;
        this.minm=minm;
        this.maxm=maxm;
        this.tax=tax;
        this.value=value;
    }
    
    //Constructing the variables for the commercial class
    public Commercial(){
        fsale="";
        minm=0.0;
        maxm=0.0;
        tax=0.0;
        value=0.0;
    }
    
    //setters

    public void setFsale(String fsale) {
        this.fsale = fsale;
    }
    public void setMinm(double minm) {
        this.minm = minm;
    }

    public void setMaxm(double maxm) {
        this.maxm = maxm;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    public void setValue(double value) {
        this.value = value;
    }
    
    //getters

    public String getFsale() {
        return fsale;
    }
    public double getMinm() {
        return minm;
    }

    public double getMaxm() {
        return maxm;
    }

    public double getTax() {
        return tax;
    }

    public double getValue() {
        return value;
    }
    
    //overriding the existing methods with different parameters
    @Override
    public void compute(){
        value=value*1.5/100;
        tax=value/12;
    }
    //overriding the print details method
    @Override
    public String printDetails(){
        return "Name: " + super.getOwner() + "\n Property type: "+super.getType()+"\n City/County: "+super.getCounty()+"\n min size: "+minm+" ft2 "+"\n max size: "+maxm+" ft2"+"\n Purpose: "+fsale;
    }
    
    
    
    
}
