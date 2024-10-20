package creational.prototype;

public class Employee implements Prototype{
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public Employee clone() {
        return new Employee(name, role);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', role='" + role + "'}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
