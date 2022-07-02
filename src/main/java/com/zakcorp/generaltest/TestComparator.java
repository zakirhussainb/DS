package com.zakcorp.generaltest;

import java.util.*;

public class TestComparator {
    static class Employee implements Comparable<Employee> {
        String name;
        int age;
        int salary;
        public Employee(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }
        public String toString(Employee e) {
            return e.name + "-" + e.age + "-" + e.salary;
        }

        @Override
        public int compareTo(Employee o) {
            return o.salary - this.salary;
        }
    }
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("B", 25, 60000));
        employeeList.add(new Employee("D", 45, 80000));
        employeeList.add(new Employee("A", 15, 50000));
        employeeList.add(new Employee("E", 55, 90000));
        employeeList.add(new Employee("C", 35, 70000));

        Collections.sort(employeeList);

//        employeeList.sort(new sortBySalaryComparator());
        for(Employee e : employeeList) {
            System.out.print(e.toString(e) + "\n");
        }
    }
    static class sortBySalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e2.salary - e1.salary;
        }
    }
}
