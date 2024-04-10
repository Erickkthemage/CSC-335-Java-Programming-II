import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Staff extends Employee {
    private String title;
    
    //default constructor that assigns support staff title but leaves other attributes null or 0
    public Staff() {
        super(null, null, null, null, null, 0 , null);
        title = "Support Staff";
    }
    
    //constructor that accepts all attributes except title and implements the default title
    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, LocalDate dateHired) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        title = "Support Staff";
    }

    //constructor that sets every attribute
    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, LocalDate dateHired, String t) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        title = t;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public String toString() {
        return getClass().getName() + "[name= " + getName() + "]";
    }
}
