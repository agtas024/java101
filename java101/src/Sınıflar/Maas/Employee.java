/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sınıflar.Maas;

/**
 *
 * @author Muammer Agtas
 */
public class Employee {

    public String name;
    public double salary;//maaş
    public int workHours;//haftalık çalışma saati
    public int hireYear;//işe başlama yılı

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary > 1000) {
            return salary * 0.03;
        } else {
            return 0;
        }
    }

    public double bonus() {
        int saat = workHours - 40;
        if (saat > 0) {
            return 30 * saat;
        } else {
            return 0.0;
        }
    }

    public double raiseSalary() {
        int year = 2021 - hireYear;
        if (10 > year) {
            return salary * 0.05;
        } else if (9 < year && 20 > year) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }

    @Override
    public String toString() {
        return String.format("Adı : " + name + "\nMaaşı : " + salary + "\nÇalışma Saati : " + workHours + "\nBaşlangıç Yılı : " + hireYear + "\nVergi : " + tax() + "\nBonus : " + bonus() + "\nMaaş Artışı : " + raiseSalary() + "\nVergi ve Bonuslar ile birlikte maaş : " + (salary + bonus() - tax()) + "\nToplam Maaş : " + (salary + bonus() + raiseSalary() - tax()));
    }
}
