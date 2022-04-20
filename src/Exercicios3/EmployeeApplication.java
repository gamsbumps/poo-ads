package Exercicios3;

import java.util.Scanner;

public class EmployeeApplication {
    public static void main(String[] args) {
        System.out.println("Input code");
        Scanner depInput = new Scanner(System.in);
        int depCode = depInput.nextInt();
        System.out.println("Input department name");
        Scanner deptInput = new Scanner(System.in);
        String depName = deptInput.next();

        System.out.println("Input employee id");
        Scanner empInput = new Scanner(System.in);
        int empId = empInput.nextInt();
        System.out.println("Input employee's name");
        Scanner emplInput = new Scanner(System.in);
        String empName = emplInput.next();

        Department dep = new Department(depCode, depName);
        Employee emp = new Employee(empId,empName, dep);
        System.out.println(emp.toString());
        System.out.println(emp.getId());
    }
}
