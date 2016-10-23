package ie.cit.assignment.domain;

import com.sun.istack.internal.NotNull;


//CREATE TABLE tax (
//        taxID varchar(1) NOT NULL,
//        taxCategory INT (1) NOT NULL,
//        taxName varchar(100) NOT NULL,
//        taxBand varchar(100) NOT NULL,
//        taxRate long (100) NOT NULL
//        );
//TODO database needs to be changed. Wrong schema
public class Tax {
    String taxID;
    int taxCategory;
    String taxName;
    long taxRangeStart;
    long taxRangeFinish;

    long taxRate;

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public int getTaxCategory() {
        return taxCategory;
    }

    public void setTaxCategory(int taxCategory) {
        this.taxCategory = taxCategory;
    }

    public String getTaxName() {
        return taxName;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }


    public long getTaxRangeStart() {
        return taxRangeStart;
    }

    public void setTaxRangeStart(long taxRangeStart) {
        this.taxRangeStart = taxRangeStart;
    }

    public long getTaxRangeFinish() {
        return taxRangeFinish;
    }

    public void setTaxRangeFinish(long taxRangeFinish) {
        this.taxRangeFinish = taxRangeFinish;
    }

    public long getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(long taxRate) {
        this.taxRate = taxRate;
    }

    public String toString() {
        return "Tax [Tax id: " + taxID + " ; Tax Range Start: +" + taxRangeStart + " ; Tax Range Finish: +" + taxRangeFinish + " ; Tax Rate: %" + taxRate;
    }
}
