/*Ability to get the Total Wage when queried by Company
- Create Method in EmpWageBuilder to get total
wage by Company
 */

package com.bridgelabz;
import com.bridgelabz.IEmployeeWageComputation;

import java.util.*;

public class EmpWageBuilder implements IEmployeeWageComputation {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
        private int numOfCompany = 0;
    //ArrayList Declaration
     ArrayList<CompanyEmpWage> companyEmpWageList;
     //HasMap Declaration using variable String = Company Name and Integer is Total Month Wage
     Map<String, CompanyEmpWage> companyToEmpWageMap;
    //Constructor for EmpWageBuilder Class
    public EmpWageBuilder() {
        companyEmpWageList = new ArrayList<>();
        companyToEmpWageMap = new HashMap<>();//HasMap for  Company Wage

    }
    //Assigning to the Array and also in HashMap
    public void addCompanyEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHours) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHours);
        companyEmpWageList.add(companyEmpWage);
        companyToEmpWageMap.put(companyName, companyEmpWage);
    }
    // Print Company Wage
     public void computeEmpWage() {
        for (int i = 0; i < companyEmpWageList.size(); i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }
    //Computing Company Wage
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
  @Override
    public  int getTotalWage(String companyName) {
        return companyToEmpWageMap.get(companyName).totalEmpWage;
    }

    //Starting of Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Welcome Message
        System.out.println("Welcome to Employee Wage Computation Program ");
        //Creating object
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("Amazon", 30, 25, 200);
        empWageBuilder.addCompanyEmpWage("Flipkart", 20, 20, 150);
        empWageBuilder.computeEmpWage();
        System.out.println("Enter company name to get TotalWage of ( Amazon, Flipkart) :" );
        String company = sc.nextLine();
        int totalWage = empWageBuilder.getTotalWage(company);
        System.out.println("The Total Wage of employee for " + company + " Company is " + totalWage + " of a month.");
    }
}





