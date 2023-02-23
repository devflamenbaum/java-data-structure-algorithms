package com.learningbydoing.chaining;


public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 1);
        Employee johnDoe = new Employee("John", "Doe", 12);
        Employee marySmith = new Employee("Mary", "Smith", 165);
        Employee mikeWilson = new Employee("Mike", "Wilson", 32);
        Employee billEnd = new Employee("Bill", "End", 219);

        ChainedHashtable ct = new ChainedHashtable();

        ct.put("Jones", janeJones);
        ct.put("Doe", johnDoe);
        ct.put("Wilson", mikeWilson);
        ct.put("Smith", marySmith);

        ct.print();

//        System.out.println("Retrieve key Smith " + ct.get("Smith"));

//        ct.remove("Doe");
//        ct.remove("Jones");
//        ct.print();
//
//        System.out.println("Retrieve key Smith " + ct.get("Smith"));

    }
}
