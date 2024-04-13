import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //instantiating a person object and printing its details
        Person person = new Person("John Doe", "123 Main St", "555-1234", "john@email.com");
        System.out.println(person);

        //instantiating a student object and printing its details
        Student student = new Student("Jane Doe", "456 Main St", "555-5678", "jane@email.com", "Sophomore");
        System.out.println(student);

        //instantiating an employee object and printing its details
        Employee employee = new Employee("Bob Smith", "789 Oak St", "555-9876", "bob@email.com", "101", 75000, LocalDate.now());
        System.out.println(employee);

        //creating a list of courses
        List<String> coursesTeaching = new ArrayList<String>();
        //adding courses to the list
        coursesTeaching.add("CSC100");
        coursesTeaching.add("CSC200");
        coursesTeaching.add("CSC330");
        coursesTeaching.add("CSC340");
        coursesTeaching.add("CSC325");
        coursesTeaching.add("CSC335");
        //instantiating a faculty object and printing its details
        Faculty faculty = new Faculty("Eva Martinez", "321 Pine St", "555-4321", "eva@email.com", "201", 50000, LocalDate.now(), coursesTeaching);
        System.out.println(faculty);

        //instantiating a staff object and printing its details
        Staff staff = new Staff("Alice Smith", "654 Cedar St", "555-8765", "alice@email.com", "301", 40000, LocalDate.now(), "Assistant");
        System.out.println(staff);

        //creating a list of employees
        List<Employee> employees = new ArrayList<Employee>();
        //adding employee objects to the list
        employees.add(new Faculty("Fred Armisen", "123 SNL St", "555-2479", "fred@mail.com", "Room 101", 1000, LocalDate.now(), coursesTeaching));
        employees.add(new Faculty("Scarlett Johansen", "123 Marvel Ave", "555-7510", "scarlett@mail.com", "Room 202", 2000, LocalDate.now(), coursesTeaching));
        employees.add(new Faculty("Dwayne Johnson", "123 Rock St", "555-2050", "dwayne@mail.com", "Room 303", 3000, LocalDate.now(), coursesTeaching));
        employees.add(new Faculty("Eva Longoria", "123 Television Bvd", "555-3856", "eva@mail.com", "Room 404", 4000, LocalDate.now(), coursesTeaching));
        employees.add(new Faculty("Tom Hanks", "123 Castaway St", "555-4614", "tom@mail.com", "Room 505", 5000, LocalDate.now(), coursesTeaching));
        employees.add(new Faculty("Monkey D. Luffy", "123 One Piece Ave", "555-2840", "monkey@mail.com", "Room 606", 6000, LocalDate.now(), coursesTeaching));
        employees.add(new Staff("Sanji Vinsmoke", "234 One Pieve Bvd", "555-3850", "sanji@mail.com", "Room 707", 7000, LocalDate.now(), "Program Manager"));
        employees.add(new Staff("Zoro Roronoa", "345 One Piece St", "555-1037", "zor@mail.com", "Room 808", 8000, LocalDate.now(), "Registrar"));
        employees.add(new Staff("Robin Nico", "456 One Piece Rd", "555-1720", "robin@mail.com", "Room 909", 9000, LocalDate.now(), "Education Coordinator"));
        employees.add(new Staff("Izuku Midoriya", "123 Hero Academia St", "555-8205", "izuku@mail.com", "Room 1000", 10000, LocalDate.now()));
        
        //prints out list of each employee object and if it's a faculty member it prints the courses they teach. If it's a staff member it prints their titles
        System.out.println("\nList of Employees:");
        List<Faculty> allFaculty = new ArrayList<Faculty>();
        List<Staff> allStaff = new ArrayList<Staff>();
        for (Employee emp : employees) {
            System.out.println("\n" + emp);
            if (emp instanceof Faculty) {
                Faculty f = (Faculty) emp;
                allFaculty.add(f);
                System.out.println("Courses Teaching:");
                for (String course : f.getCoursesTeaching()) {
                    System.out.println("- " + course);
                }
            }
            if (emp instanceof Staff) {
                Staff s = (Staff) emp;
                allStaff.add(s);
                System.out.println("Title= " + s.getTitle());
            }
        } 

        //instantiating student objects
        Student student1 = new Student("Erick Diaz", "123 Cool St", "555-6149", "erick@mail.com", "Freshman"); 
        Student student2 = new Student("Courtney Muni", "123 Awesome Ave", "555-0915", "courtney@mail.com", "Freshman"); 
        Student student3 = new Student("Michael Gomez", "123 Far Bvd", "555-9164", "michael@mail.com", "Freshman"); 
        Student student4 = new Student("Jordan Figueroa", "123 House St", "555-1238", "jordan@mail.com", "Senior"); 
        Student student5 = new Student("Carolina Figueroa", "123 House St", "555-1468", "carolina@mail.com", "Junior"); 
        
        //creating a list of CourseDetails objects
        List<CourseDetails> coursesList = new ArrayList<CourseDetails>();
        CourseDetails course1 = new CourseDetails("CSC100", allFaculty.get(0));
        CourseDetails course2 = new CourseDetails("CSC200", allFaculty.get(1));
        CourseDetails course3 = new CourseDetails("CSC330", allFaculty.get(2));
        CourseDetails course4 = new CourseDetails("CSC340", allFaculty.get(3));
        CourseDetails course5 = new CourseDetails("CSC325", allFaculty.get(4));
        CourseDetails course6 = new CourseDetails("CSC335", allFaculty.get(5));

        //adding courses to the coursesList
        coursesList.add(course1);
        coursesList.add(course2);
        coursesList.add(course3);
        coursesList.add(course4);
        coursesList.add(course5);
        coursesList.add(course6);

        //adding students to the courses
        course1.addStudent(student1, student2, student3);
        course2.addStudent(student1, student2, student3);
        course3.addStudent(student1, student2, student3);
        course4.addStudent(student4, student5);
        course5.addStudent(student4, student5);
        course6.addStudent(student4, student5);

        //adding all the staff members to every course
        for (Staff s : allStaff) {
            course1.addStaff(s);
            course2.addStaff(s);
            course3.addStaff(s);
            course4.addStaff(s);
            course5.addStaff(s);
            course6.addStaff(s);
        }

        //printing the list of courses and their details including faculty, staff, and student details
        System.out.println("\nCourse Details:\n");
        for (CourseDetails c : coursesList) {
            System.out.println(c);
        }
    }
}
