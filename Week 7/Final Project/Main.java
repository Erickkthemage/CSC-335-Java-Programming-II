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
        employees.add(new Faculty("Faculty 1", "Address 1", "Phone 1", "Email 1", "Office 1", 1000, LocalDate.now(), coursesTeaching));
        employees.add(new Faculty("Faculty 2", "Address 2", "Phone 2", "Email 2", "Office 2", 2000, LocalDate.now(), coursesTeaching));
        employees.add(new Faculty("Faculty 3", "Address 3", "Phone 3", "Email 3", "Office 3", 3000, LocalDate.now(), coursesTeaching));
        employees.add(new Faculty("Faculty 4", "Address 4", "Phone 4", "Email 4", "Office 4", 4000, LocalDate.now(), coursesTeaching));
        employees.add(new Faculty("Faculty 5", "Address 5", "Phone 5", "Email 5", "Office 5", 5000, LocalDate.now(), coursesTeaching));
        employees.add(new Faculty("Faculty 6", "Address 6", "Phone 6", "Email 6", "Office 6", 6000, LocalDate.now(), coursesTeaching));
        employees.add(new Staff("Staff 1", "Address 7", "Phone 7", "Email 7", "Office 7", 7000, LocalDate.now(), "Title 1"));
        employees.add(new Staff("Staff 2", "Address 8", "Phone 8", "Email 8", "Office 8", 8000, LocalDate.now(), "Title 2"));
        employees.add(new Staff("Staff 3", "Address 9", "Phone 9", "Email 9", "Office 9", 9000, LocalDate.now(), "Title 3"));
        employees.add(new Staff("Staff 4", "Address 10", "Phone 10", "Email 10", "Office 10", 10000, LocalDate.now()));
        
        //prints out list of each employee object and if it's a faculty member it prints the courses they teach. If it's a staff member it prints their titles
        System.out.println("\nList of Employees:\n");
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
        Student student1 = new Student("Student 1", "Address 1", "Phone 1", "Email 1", "Freshman"); 
        Student student2 = new Student("Student 2", "Address 2", "Phone 2", "Email 2", "Freshman"); 
        Student student3 = new Student("Student 3", "Address 3", "Phone 3", "Email 3", "Freshman"); 
        Student student4 = new Student("Student 4", "Address 4", "Phone 4", "Email 4", "Senior"); 
        Student student5 = new Student("Student 5", "Address 5", "Phone 5", "Email 5", "Junior"); 
        
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
