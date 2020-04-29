package com.company;

public class Owner {
    public void giveRaise(Employee employee, double raise){
        employee.setBaseSalary(employee.getBaseSalary()*raise);
    }
}
