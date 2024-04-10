import java.util.ArrayList;
import java.util.List;

class CourseDetails implements Course {
    private String courseName;
    private List<Student> students;
    private Faculty faculty;
    private List<Staff> staff;

    public CourseDetails(String c, Faculty f) {
        courseName = c;
        faculty = f;
        students = new ArrayList<Student>();
        staff = new ArrayList<Staff>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String newCourseName) {
        courseName = newCourseName;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    //method to add one student
    public void addStudent(Student student1) {
        students.add(student1);
    }

    //method to add two students    
    public void addStudent(Student student1, Student student2) {
        students.add(student1);
        students.add(student2);
    }

    //method to add three students
    public void addStudent(Student student1, Student student2, Student student3) {
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void assignFaculty(Faculty f) {
        faculty = f;
    }

    public void addStaff(Staff staffMember) {
        staff.add(staffMember);
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course: ").append(courseName).append("\n");
        sb.append("Faculty: ").append(faculty.getName()).append("\n");
        sb.append("Faculty Details:\n");
        sb.append("- ").append(faculty.getName()).append("\n");
        sb.append("    Address: " + faculty.getAddress()).append("\n");
        sb.append("    Email: " + faculty.getEmailAddress()).append("\n");
        sb.append("    Phone Number: " + faculty.getPhoneNumber()).append("\n");
        sb.append("    Office: " + faculty.getOffice()).append("\n");
        sb.append("    Salary: " + faculty.getSalary()).append("\n");
        sb.append("    Date Hired: " + faculty.getDateHired()).append("\n");
        sb.append("Assigned Students:\n");
        for (Student student: students) {
            sb.append("- ").append(student.getName()).append("\n");
            sb.append("    Address: ").append(student.getAddress()).append("\n");
            sb.append("    Email: ").append(student.getEmailAddress()).append("\n");
            sb.append("    Phone: ").append(student.getPhoneNumber()).append("\n");
        }
        sb.append("Assigned Staff:\n");
        for (Staff staffMember: staff) {
            sb.append("- ").append(staffMember.getName()).append("\n");
            sb.append("    Name: ").append(staffMember.getName()).append("\n");
            sb.append("    Address: ").append(staffMember.getAddress()).append("\n");
            sb.append("    Email: ").append(staffMember.getEmailAddress()).append("\n");
            sb.append("    Phone Number: ").append(staffMember.getPhoneNumber()).append("\n");
            sb.append("    Office: ").append(staffMember.getOffice()).append("\n");
            sb.append("    Salary: ").append(staffMember.getSalary()).append("\n");
            sb.append("    Date Hired: ").append(staffMember.getDateHired()).append("\n");
            sb.append("    Title: ").append(staffMember.getTitle()).append("\n");
        }
        return sb.toString();
    }
}
