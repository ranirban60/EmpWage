package com.bridgelabz;

interface IEmployeeWageComputation{
    public void addCompanyEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHours);
    public void computeEmpWage();
    public int getTotalWage(String companyName);
}

public class CompanyEmpWage {

     public final String companyName;
     public final int wagePerHr;
     public final int maxWorkingDays;
     public final int maxWorkingHours;
     public int totalEmpWage;

    //Constructor
    public CompanyEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHr = wagePerHr;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        totalEmpWage = 0 ;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
       // System.out.println("                                                             ");
        //System.out.println("* Total Information of " + companyName + " employee");
      //  System.out.println("Wage per hour:" + wagePerHr);
      //  System.out.println("Maximum working days:" + maxWorkingDays);
      //  System.out.println("Maximum working hours:" + maxWorkingHours);
        return "Total wage for a month of the Company " + companyName + " is " + totalEmpWage;
    }

}