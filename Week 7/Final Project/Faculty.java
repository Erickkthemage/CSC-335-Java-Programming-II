import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Faculty extends Employee {
    private List<String> coursesTeaching;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, LocalDate dateHired, List<String> c) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        coursesTeaching = c;
    }

    public List<String> getCoursesTeaching() {
        return coursesTeaching;
    }

    public void setCoursesTeaching(List<String> newCoursesTeaching) {
        coursesTeaching = newCoursesTeaching;
    }

    public String toString() {
        return getClass().getName() + "[name= " + getName() + "]";
    }
}
