package COM.EMPLOYEE;

import org.springframework.context.annotation.Bean;

public class EmployeeConfig {
    @Bean("Employee")
    public Employee getEmployeeDetail(){
        Employee employee = new Employee(getDepartment());
        employee.setId(1);
        employee.setName("rishav");
        employee.setAddress("Bihar");
        return employee;
    }
    @Bean
    public Department getDepartment(){
        return new Department(1,"project");
    }
}
