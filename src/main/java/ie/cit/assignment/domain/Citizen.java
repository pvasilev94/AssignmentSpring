package ie.cit.assignment.domain;

import com.sun.istack.internal.NotNull;

/**
 * Created by Pavel on 18/10/2016.
 */
public class Citizen {
    @NotNull
    String name;

    @NotNull
    double salary;

    public Citizen() {}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Citizen [Name: " + name +" ; Salary: " + salary + "]";
    }
}
