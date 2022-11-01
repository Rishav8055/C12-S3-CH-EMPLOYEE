package COM.EMPLOYEE;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private int id;
    private String Name;
    private String address;
    private Department department;

    @Autowired

    public Employee(Department department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", address='" + address + '\'' +
                ", department=" + department +
                '}';
    }
}
