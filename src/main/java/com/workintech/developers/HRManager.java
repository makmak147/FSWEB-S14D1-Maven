package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        // Dizilerin boyutlarını örnek olarak 5 başlatalım (ihtiyaca göre değişebilir)
        this.juniorDevelopers = new JuniorDeveloper[5];
        this.midDevelopers = new MidDeveloper[5];
        this.seniorDevelopers = new SeniorDeveloper[5];
    }

    @Override
    public void work() {
        System.out.println("HR Manager " + getName() + " starts to working");
        setSalary(getSalary() + 4000);
    }

    // Junior ekleme metodu
    public void addEmployee(int index, JuniorDeveloper developer) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Geçersiz index!");
        } else if (juniorDevelopers[index] == null) {
            juniorDevelopers[index] = developer;
            System.out.println("Junior Developer eklendi.");
        } else {
            System.out.println("Bu index dolu!");
        }
    }

    // Mid ekleme metodu (Overload)
    public void addEmployee(int index, MidDeveloper developer) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Geçersiz index!");
        } else if (midDevelopers[index] == null) {
            midDevelopers[index] = developer;
            System.out.println("Mid Developer eklendi.");
        } else {
            System.out.println("Bu index dolu!");
        }
    }

    // Senior ekleme metodu (Overload)
    public void addEmployee(int index, SeniorDeveloper developer) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Geçersiz index!");
        } else if (seniorDevelopers[index] == null) {
            seniorDevelopers[index] = developer;
            System.out.println("Senior Developer eklendi.");
        } else {
            System.out.println("Bu index dolu!");
        }
    }
}