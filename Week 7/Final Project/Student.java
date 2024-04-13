class Student extends Person {
    private final String CLASS_STATUS;

    public Student(String name, String address, String phoneNumber, String emailAddress, String classStatus) {
        super(name, address, phoneNumber, emailAddress);
        CLASS_STATUS = classStatus;
    }

    public String getClassStatus() {
        return CLASS_STATUS;
    }

    public String toString() {
        return getClass().getName() + "[name= " + getName() + "]";
    }
}
