package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Owner owner = new Owner();

//        employees.add(new Employee());
        employees.add(new TechnicalWriter("Mark", 50000, 4, 2));
        employees.add(new Engineer("Natashia", 50000, 7, 2));
        employees.add(new ProductManager("Carlos", 50000, 8, 5));

        for(Employee a : employees) {
            if(a.getType().equals("Engineer")){
                owner.giveRaise(a, 1.25);
            }
            System.out.println(a);
            System.out.println();
            System.out.println(a.getType());
        }
    }
}