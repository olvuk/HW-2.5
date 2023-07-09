package pro.sky.java.course2.homework2_5;

public class Employee {

    private final String firstName;
    private final String lastName;


    public Employee(String name, String lastName) {
        this.firstName = name;
        this.lastName = lastName;
    }

    public String getName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



    public String toString() {
        return "Имя: " + firstName + " Фамилия " + lastName;
    }
}



