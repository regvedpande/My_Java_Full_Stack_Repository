package our.controller.control;

import employee.our.dto.AddressDto;
import employee.our.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @RequestMapping("/employees")
    public ResponseEntity<Object> getEmployees() {
        List<EmployeeDto> employees = new ArrayList<>();

        // Employee 1: Ashish
        EmployeeDto employee1 = new EmployeeDto();
        employee1.setName("Ashish");
        employee1.setDepartment("CEO and CTO");
        employee1.setDesignation("Chief Executive Officer and Chief Technology Officer");

        AddressDto address1 = new AddressDto();
        address1.setStreet("1234 Main St");
        address1.setCity("Springfield");
        address1.setState("IL");
        address1.setCountry("India");

        employee1.setAddress(address1);
        employees.add(employee1);

        // Employee 2: Gati
        EmployeeDto employee2 = new EmployeeDto();
        employee2.setName("Gati");
        employee2.setDepartment("HR");
        employee2.setDesignation("HR Manager");

        AddressDto address2 = new AddressDto();
        address2.setStreet("5678 Elm St");
        address2.setCity("Springfield");
        address2.setState("IL");
        address2.setCountry("USA");

        employee2.setAddress(address2);
        employees.add(employee2);

        // Employee 3: Regved
        EmployeeDto employee3 = new EmployeeDto();
        employee3.setName("Regved");
        employee3.setDepartment("Finance");
        employee3.setDesignation("Accountant");

        AddressDto address3 = new AddressDto();
        address3.setStreet("910 Maple St");
        address3.setCity("Springfield");
        address3.setState("IL");
        address3.setCountry("USA");

        employee3.setAddress(address3);
        employees.add(employee3);

        // Employee 4: Ashik
        EmployeeDto employee4 = new EmployeeDto();
        employee4.setName("Ashik");
        employee4.setDepartment("Marketing");
        employee4.setDesignation("Marketing Manager");

        AddressDto address4 = new AddressDto();
        address4.setStreet("1112 Oak St");
        address4.setCity("Springfield");
        address4.setState("IL");
        address4.setCountry("USA");

        employee4.setAddress(address4);
        employees.add(employee4);

        // Employee 5: Vinay
        EmployeeDto employee5 = new EmployeeDto();
        employee5.setName("Vinay");
        employee5.setDepartment("Sales");
        employee5.setDesignation("Sales Executive");

        AddressDto address5 = new AddressDto();
        address5.setStreet("1314 Pine St");
        address5.setCity("Springfield");
        address5.setState("IL");
        address5.setCountry("USA");

        employee5.setAddress(address5);
        employees.add(employee5);

        // Employee 6: Chetan
        EmployeeDto employee6 = new EmployeeDto();
        employee6.setName("Chetan");
        employee6.setDepartment("Support");
        employee6.setDesignation("Support Engineer");

        AddressDto address6 = new AddressDto();
        address6.setStreet("1516 Birch St");
        address6.setCity("Springfield");
        address6.setState("IL");
        address6.setCountry("USA");

        employee6.setAddress(address6);
        employees.add(employee6);

        return ResponseEntity.ok(employees);
    }
}