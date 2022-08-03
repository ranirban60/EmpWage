package com.bridgelabz;

public class EmpWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program ");
        totalEmpWage("Amazon",30, 25, 200);
        totalEmpWage("Flipkart",20, 20, 150);
        }

    private static void totalEmpWage(String companyName, int wagePerHr, int maxWorkingDays,int maxWorkingHours) {

        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;

        int totalWage = 0;
        int emp_hr = 0;

        System.out.println("Employee of " + companyName);
        System.out.println("Wage per hour " + wagePerHr);
        System.out.println("Maximum working days " + maxWorkingDays);
        System.out.println("Maximum working hours " + maxWorkingHours + "\n");


        for (int day =1, total_working_hrs =0; total_working_hrs <= maxWorkingHours && day <= maxWorkingDays; day++, total_working_hrs += emp_hr ) {

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
            int wage = wagePerHr * emp_hr;
            totalWage += wage;
            System.out.println("No of days = " + day);
            System.out.println("No of working hrs = " + emp_hr);
            System.out.println("Wage only day " + day + " is = " +wage);
            System.out.println("Total Wage upto day " + day + " is = " + totalWage + "\n");
        }
        System.out.println("Total wage for a month of the " + companyName + " employee is " + totalWage + "\n");
    }
}


