class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(String n, String a, String p, String e) {
        name = n;
        address = a;
        phoneNumber = p;
        emailAddress = e;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String newPhoneNumber) {
        phoneNumber = newPhoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String newEmailAddress) {
        emailAddress = newEmailAddress;
    }

    public String toString() {
        return getClass().getName() + "[name= " + name + "]";
    }
}
