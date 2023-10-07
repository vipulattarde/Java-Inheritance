package inheritance;

//Write a Java program to create a class known as Person with methods called getFirstName() and getLastName().
// Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method
// to include the employee's job title.//
class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    private int employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }

}

public class Office {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Vipul ", "Attarde ", 4451, "HR Manager, ");
        System.out.println(employee1.getFirstName() + employee1.getLastName() + employee1.getEmployeeId());
        Employee employee2 = new Employee("Himanshu ", "Rane ", 4452, "Software Manager, ");
        System.out.println(employee2.getFirstName() + employee2.getLastName() + employee2.getEmployeeId());
    }
}
