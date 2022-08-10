package net.akshay.empmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.akshay.empmanagementsystem.model.Employee;
import net.akshay.empmanagementsystem.repository.EmployeeRepository;

@SpringBootApplication
public class EmpManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmpManagementSystemApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("firstName");
		employee.setLastName("lastName");
		employee.setEmailId("emailId@gmail.com");
		employeeRepository.save(employee);
	}
}
