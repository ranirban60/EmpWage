package com.bridgelabz;

public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program ");
        totalEmpWage("Amazon",30, 25, 200);
        totalEmpWage("Flipkart",20, 20, 150);
        }

    public static int totalEmpWage(String companyName, int wagePerHr, int maxWorkingDays,int maxWorkingHours) {
        int emp_hr = 0;
        int totalWorkingHrs = 0;
        int totalWorkingDays = 0;

        System.out.println("Employee of " + companyName);
        System.out.println("Wage per hour " + wagePerHr);
        System.out.println("Maximum working days " + maxWorkingDays);
        System.out.println("Maximum working hours " + maxWorkingHours + "\n");


        while (totalWorkingHrs < maxWorkingHours && totalWorkingDays < maxWorkingDays ) {
            totalWorkingDays++;
            double attendance = Math.floor(Math.random() * 10) % 3;
            switch ((int) attendance) {
                case IS_FULL_TIME -> {
                    emp_hr = 8;
                    break;
                }
                case IS_PART_TIME -> {
                    emp_hr = 4;
                    break;
                }
                default -> {
                    emp_hr = 0;
                    break;
                }
            }
            totalWorkingHrs += emp_hr;
            System.out.println("No of days = " + totalWorkingDays);
            System.out.println("No of working hrs = " + emp_hr );
        }
        int totalWage = wagePerHr * totalWorkingHrs;
        System.out.println();
        System.out.println("No of Total Working Hrs in the month is " + totalWorkingHrs);
        System.out.println("Total wage for a month of the " + companyName + " employee is " + totalWage + "\n");
        return totalWage;
    }
}


