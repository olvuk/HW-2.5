package pro.sky.java.course2.homework2_5;

public class Employee {

    private final String name;
    private final String lastName;


    public Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }



    public String toString() {
        return "Имя: " + name + " Фамилия " + lastName;
    }
}



