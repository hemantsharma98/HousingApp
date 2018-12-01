/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housingapp;

import java.io.Serializable;

/**
 *
 * @author x17114357
 */
public abstract class Housing implements Serializable {
    protected String owner;
    protected String type;
    protected String county;
    protected int bedrooms;
    protected int bathrooms;

    public Housing(String owner, String type, String county, int bedrooms, int bathrooms) {
        this.owner = owner;
        this.type = type;
        this.county = county;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }
    public Housing(){
        owner="";
        type="";
        county="";
        bedrooms=0;
        bathrooms=0;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public String getOwner() {
        return owner;
    }

    public String getType() {
        return type;
    }

    public String getCounty() {
        return county;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }
    
    public String printDetails(){
        return "Records" + "\n Owner: " + owner + "\n Type: " + type + "\n County: " + county + "\n Bedrooms: " + bedrooms + "\n Bathrooms: " + bathrooms; 
    }
    
    public abstract void compute();
}
