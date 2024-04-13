import java.util.List;

interface Course {
    void addStudent(Student student);
    List<Student> getStudents();
    void assignFaculty(Faculty faculty);
    void addStaff(Staff staff);
    List<Staff> getStaff();
}
