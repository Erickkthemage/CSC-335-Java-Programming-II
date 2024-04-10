# Final Project

**Project Description**

Design a class named Person and its two subclasses named Student and Employee.

Make Faculty and Staff subclasses of Employee.

A person has a name, address, phone number, and email address.

A student has a class status (freshman, sophomore, junior, or senior). Define the status as a constant.

An employee has an office, salary, and date hired (Use LocalDateLinks to an external site. class provided by Java SE.). 

A faculty member teaches one or more courses from the pre-assigned list of courses [CSC100, CSC200, CSC330, CSC340, CSC325, CSC335]. 

A staff member has a title such as [Education Coordinator, Registrar, Program Manager, Assistant, Support Staff]. A default Staff object should be assigned a title of 'Support Staff' (hint: default constructor used to create a staff object)

Override the toString method in each class to display the class name and the person’s name.

Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods. Create a list of employees that contains a total of 10 employees out of which 6 are Faculty and the remaining 4 are Staff members. 

Each Faculty should be given a list of courses to teach (at least 2 or more).

Each staff member should have a title assigned. No 2 Staff members can have the same title and at least one staff member should have a default title [Support Staff].

Create an interface called Course each student should belong to at least 3 courses and each course will have one and only one course assigned to them. 

Print the list of courses and for each course print the assigned students (their name, address, email, phone number), print the name of the faculty teaching the course and faculty details. Assign all staff members to each course and list their details as well.
