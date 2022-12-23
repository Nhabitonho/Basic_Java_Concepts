package exercise.exercise6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee nv1 = new Employee("Long", "Bui", 100.000);
        Employee nv2 = new Employee("Phat", "Nguyen", 200);
        Employee nv3 = new Employee("An", "Nguyen", 300);
        Employee nv4 = new Employee("Huy", "Ngo", -19);
        Employee nv5 = new Employee("Khai", "Phan", 0);

        //information of employee
        System.out.println("FirstName: " + nv1.firstName + " LastName: " + nv1.lastName + " Salary: " + nv1.monthSalary);
        System.out.println("FirstName: " + nv2.firstName + " LastName: " + nv2.lastName + " Salary: " + nv2.monthSalary);
        System.out.println("FirstName: " + nv3.firstName + " LastName: " + nv3.lastName + " Salary: " + nv3.monthSalary);
        System.out.println("FirstName: " + nv4.firstName + " LastName: " + nv4.lastName + " Salary: " + nv4.monthSalary);
        System.out.println("FirstName: " + nv5.firstName + " LastName: " + nv5.lastName + " Salary: " + nv5.monthSalary);

        //raise 10% salary
        nv1.setMonthSalary(nv1.getMonthSalary() + nv1.getMonthSalary() * 0.1);
        nv2.setMonthSalary(nv2.getMonthSalary() + nv2.getMonthSalary() * 0.1);
        nv3.setMonthSalary(nv3.getMonthSalary() + nv3.getMonthSalary() * 0.1);
        nv4.setMonthSalary(nv4.getMonthSalary() + nv4.getMonthSalary() * 0.1);
        nv5.setMonthSalary(nv5.getMonthSalary() + nv5.getMonthSalary() * 0.1);
        System.out.println("Raise 10% salary of employee !!");
        System.out.println(nv1.getMonthSalary());
        System.out.println(nv2.getMonthSalary());
        System.out.println(nv3.getMonthSalary());
        System.out.println(nv4.getMonthSalary());
        System.out.println(nv5.getMonthSalary());


    }
}
