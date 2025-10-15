package com.devsuperior.aula;

import com.devsuperior.aula.entity.Employee;
import com.devsuperior.aula.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {
    //Depenência
    @Autowired
    private SalaryService salaryService;

    public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee("Maria" , 4000.00);
        System.out.println(salaryService.netSalary(employee));
    }
}
