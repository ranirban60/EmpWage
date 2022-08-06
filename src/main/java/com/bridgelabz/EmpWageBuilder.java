package com.bridgelabz;

import java.util.ArrayList;

public class EmpWageBuilder implements EmployeeWageComputation {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

     int numOfCompany = 0 ;
     ArrayList<CompanyEmpWage> companyEmpWageList;

    public EmpWageBuilder() {
        companyEmpWageList = new ArrayList<>();
    }

    public void addCompanyEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHours) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHours);
        companyEmpWageList.add(companyEmpWage);
        numOfCompany++;
    }

    public void computeEmpWage() {
        for (int i = 0; i < companyEmpWageList.size(); i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }

     int computeEmpWage(CompanyEmpWage companyEmpWage) {
        int emp_hr = 0 ;
        int totalWorkingHrs = 0;
        int totalWorkingDays = 0;
         while (totalWorkingHrs <= companyEmpWage.maxWorkingHours && totalWorkingDays < companyEmpWage.maxWorkingDays) {
          totalWorkingDays++;
            int attendance = (int) Math.floor(Math.random() * 10) % 3;
            switch (attendance) {
                case IS_FULL_TIME -> {
                    emp_hr = 8;
                    System.out.println("Employee is working Full Time");
                    break;
                }
                case IS_PART_TIME -> {
                    emp_hr = 4;
                    System.out.println("Employee is working PartTime");
                    break;
               }
                default -> {
                   emp_hr = 0;
                   System.out.println("Employee is Absent");
                    break;
                }
            }
            totalWorkingHrs += emp_hr;
            System.out.println("No of days = " + totalWorkingDays);
            System.out.println("No of working hrs = " + emp_hr);
        }
       return totalWorkingHrs * companyEmpWage.wagePerHr;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program ");
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("Amazon", 30, 25, 200);
        empWageBuilder.addCompanyEmpWage("Flipkart", 20, 20, 150);
        empWageBuilder.computeEmpWage();
    }
}





