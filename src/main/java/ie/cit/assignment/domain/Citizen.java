package ie.cit.assignment.domain;

import com.sun.istack.internal.NotNull;

/**
 * Created by Pavel on 18/10/2016.
 */
public class Citizen {
    @NotNull
    String name;

    @NotNull
    long salary;

    long takeHomePay;

    public Citizen() {}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getTakeHomePay() {
        return takeHomePay;
    }

    public void setTakeHomePay(long takeHomePay) {
        this.takeHomePay = takeHomePay;
    }

    public String toString() {
        return "Citizen [Name: " + name + " ; Salary: " + salary + " TakeHomePay: " + takeHomePay + "]";
    }
}
