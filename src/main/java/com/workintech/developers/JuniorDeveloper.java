package com.workintech.developers;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Junior Developer " + getName() + " starts to working");
        setSalary(getSalary() + 1000); // Maaş güncellemesi
    }
}