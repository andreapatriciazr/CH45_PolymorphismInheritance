package com.generation;
import java.util.HashMap;

public class SalesManager {
    HashMap<Integer, SalesRep> salesTeam = new HashMap<>();

    public double calculateCommission(double salesMade) {
        // commission = 0.1 * salesMade
        return 0.1 * salesMade;
    } // method calculateComission

    public void addSalesRep(int id, SalesRep salesRep) {
        salesTeam.put(id, salesRep);
    } // method addSalesRep
    
} // class SalesManager