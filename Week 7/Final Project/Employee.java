import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Employee extends Person {
    private String office;
    private double salary;
    private LocalDate dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String o, double s, LocalDate d) {
        super(name, address, phoneNumber, emailAddress);
        office = o;
        salary = s;
        dateHired = d;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String newOffice) {
        office = newOffice;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public String toString() {
        return getClass().getName() + "[name= " + getName() + "]";
    }
}
