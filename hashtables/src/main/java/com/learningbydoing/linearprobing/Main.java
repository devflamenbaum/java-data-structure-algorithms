package com.learningbydoing.linearprobing;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 1);
        Employee johnDoe = new Employee("John", "Doe", 12);
        Employee marySmith = new Employee("Mary", "Smith", 165);
        Employee mikeWilson = new Employee("Mike", "Wilson", 32);
        Employee billEnd = new Employee("Bill", "End", 219);

        SimpleHashtable ht = new SimpleHashtable(10);

        ht.put(janeJones.getLastName(), janeJones);
        ht.put(johnDoe.getLastName(), johnDoe);
        ht.put(mikeWilson.getLastName(), mikeWilson);
        ht.put(marySmith.getLastName(), marySmith);

        //ht.printHashtable();
        //System.out.println(ht.get(billEnd.getLastName()));

        ht.remove("Wilson");
        ht.remove("Jones");

        ht.printHashtable();

        //System.out.println(ht.get("Wilson"));
    }
}
