package ie.cit.assignment.domain;

import com.sun.istack.internal.NotNull;

/**
 A.	The first €10,000 is exempt from tax
 B.	The next €15,000 is subject to 20%
 C.	The remainder is taxed at 40%
 D.	There is also a solidarity tax charged on all income of 3%
 */

public class Tax {
    @NotNull
    String TAX_A;

    @NotNull
    String TAX_B;

    @NotNull
    String TAX_C;

    @NotNull
    String TAX_D;


    public Tax() {}

    public String getTAX_A() {
        return TAX_A;
    }

    public void setTAX_A(String TAX_A) {
        this.TAX_A = TAX_A;
    }

    public String getTAX_B() {
        return TAX_B;
    }

    public void setTAX_B(String TAX_B) {
        this.TAX_B = TAX_B;
    }

    public String getTAX_C() {
        return TAX_C;
    }

    public void setTAX_C(String TAX_C) {
        this.TAX_C = TAX_C;
    }

    public String getTAX_D() {
        return TAX_D;
    }

    public void setTAX_D(String TAX_D) {
        this.TAX_D = TAX_D;
    }
}
