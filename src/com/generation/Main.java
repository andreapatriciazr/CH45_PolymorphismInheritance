package com.generation;

public class Main {

    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Andrei", "Woolfolk", 12345, 28, 360, 30, 50000, 5);
        Employee employee2 = new Employee("Juan", "Garcia", 67890, 30, 500, 15, 30000, 1);
        
        System.out.println("Employee: " + employee1.getFirstName() + " " + employee1.getLastName());
        System.out.println("Time to retirement: " + employee1.timeToRetirement() + " years");

        System.out.println("Employee: " + employee2.getFirstName() + " " + employee2.getLastName());
        System.out.println("Time to retirement: " + employee2.timeToRetirement() + " years");

        SalesManager salesManager = new SalesManager();
        SalesRep rep1 = new SalesRep("Andrea", 400);
        SalesRep rep2 = new SalesRep("Patricia", 600);
        
        salesManager.addSalesRep(1, rep1);
        salesManager.addSalesRep(2, rep2);
        
        System.out.println();
        System.out.println("Representative: " + rep1.getName() + " made " + rep1.getSalesMade() + " sales.");
        System.out.println("Representative: " + rep1.getName() + " made " + rep2.getSalesMade() + " sales.");

    } // main
} // class Main
