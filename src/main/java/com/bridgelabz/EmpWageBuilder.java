/*Store the Daily Wage of the company along with the Total Wage
*/

package com.bridgelabz;
import com.bridgelabz.IEmployeeWageComputation;
import java.util.ArrayList;// Impoprting ArrayList Class
import java.util.HashMap;//Importing HasMap from Package


public class EmpWageBuilder implements IEmployeeWageComputation {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
        private int numOfCompany ,index ;
    //ArrayList Declaration
     ArrayList<CompanyEmpWage> companyEmpWageList;
     //HasMap Declaration using variable String = Company Name and Integer is Total Month Wage
     HashMap<String, Integer> companyToEmpWageMap;

    //Constructor for EmpWageBuilder Class
    public EmpWageBuilder() {
        companyEmpWageList = new ArrayList<>();
        companyToEmpWageMap = new HashMap<>();
    }
    //Assigning to the Array
    public void addCompanyEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHours) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHours);
        companyEmpWageList.add(companyEmpWage);
        companyToEmpWageMap.put(companyName, 0);
    }
    // Print Company Wage
     public void computeEmpWage() {
        for (int i = 0; i < companyEmpWageList.size(); i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }
    public void companyDailyWage(){
        System.out.println("Daily wage for  the employee is: ");
        for (String companyName : companyToEmpWageMap.keySet())// Returns a Set view of the keys contained in this map
        System.out.println(companyName + "company daily wage per emp : " + companyToEmpWageMap.get(companyName));//Get method is used to get the value
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
            int wage = emp_hr * companyEmpWage.wagePerHr;
            companyToEmpWageMap.put(companyEmpWage.companyName, wage);//Insert the entry in Map
        }
       return totalWorkingHrs * companyEmpWage.wagePerHr;
    }
    //Starting of Main Method
    public static void main(String[] args) {
        //Welcome Message
        System.out.println("Welcome to Employee Wage Computation Program ");
        //Creating object
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("Amazon", 30, 25, 200);
        empWageBuilder.addCompanyEmpWage("Flipkart", 20, 20, 150);
        empWageBuilder.computeEmpWage();
        empWageBuilder.companyDailyWage();
    }
}





