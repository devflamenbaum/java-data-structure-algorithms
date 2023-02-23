package com.learningbydoing.jdk;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 1);
        Employee johnDoe = new Employee("John", "Doe", 12);
        Employee marySmith = new Employee("Mary", "Smith", 165);
        Employee mikeWilson = new Employee("Mike", "Wilson", 32);
        Employee billEnd = new Employee("Bill", "End", 219);

        Map<String, Employee> map = new HashMap<>();
        map.put("Jones", janeJones);
        map.put("Doe", johnDoe);
        map.put("Smith", marySmith);

        for (Employee employee : map.values()) {
            System.out.println(employee);
        }
    }
}
