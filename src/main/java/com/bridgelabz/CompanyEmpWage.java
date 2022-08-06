package com.bridgelabz;
public class CompanyEmpWage {

    public final String companyName;
    public final int wagePerHr;
    public final int maxWorkingDays;
    public final int maxWorkingHours;
    public int totalEmpWage;

    public CompanyEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHr = wagePerHr;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }
    @Override
    public String toString() {
        return "Total wage for a month of the Company " + companyName + " is " + totalEmpWage;
    }
}