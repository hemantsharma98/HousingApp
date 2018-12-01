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
public class Fixed extends Housing implements Serializable {

    private double fixed_price;

    public Fixed(double fixed_price, int years, double mortgage, String owner, String type, String county, int bedrooms, int bathrooms) {
        super(owner, type, county, bedrooms, bathrooms);
        this.fixed_price = fixed_price;
    }

    public Fixed() {
        super();
        fixed_price = 0.0;
    }

    public void setFixed_price(double fixed_price) {
        this.fixed_price = fixed_price;
    }

    public double getFixed_price() {
        return fixed_price;
    }

    @Override
    public void compute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String printDetails() {
        return super.printDetails() + "\n Fixed Price: €" + fixed_price;
    }
}
