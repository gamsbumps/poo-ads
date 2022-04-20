package Exercicios3;

public class Employee {
    private int id;
    private String name;
    private Department department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) this.id = id;
        else System.out.println("Id must be different than 0!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) this.name = name;
        else System.out.println("Name cannot be null.");
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    public Employee(int id, String name, Department department) {
        this.setId(id);
        this.setName(name);
        this.setDepartment(department);
    }

    @Override
    public String toString() {
        return "Employee: " +
                "Id: " + id +
                ", Name: " + name +
                ", " + department;
    }
}
