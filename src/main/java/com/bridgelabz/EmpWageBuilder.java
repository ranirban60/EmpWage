package com.bridgelabz;

public class EmpWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program ");
        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;
        final int WAGE_PER_HR = 20;
        final int FULL_TIME = 8;
        final int PART_TIME = 4;
        final int MAX_WORKING_DAYS = 20;
        final int MAX_HRS = 100;

        int wage_per_month = 0;
        int total_working_hrs = 0;
        int emp_hr = 0;
        int day =0;

        while ( total_working_hrs < MAX_HRS && day < MAX_WORKING_DAYS ) {
            day++;
            double attendance = Math.floor(Math.random() * 10) % 3;
            switch ((int) attendance) {
                case IS_FULL_TIME -> {
                    emp_hr = FULL_TIME;
                    break;
                }
                case IS_PART_TIME -> {
                    emp_hr = PART_TIME;
                    break;
                }
                default -> {
                    emp_hr = 0;
                    break;
                }
            }
            total_working_hrs += emp_hr;
            wage_per_month += WAGE_PER_HR*emp_hr;
        }
        System.out.println("No of days = " +day);
        System.out.println("No of hrs = " +total_working_hrs);
        System.out.println("Wage per month = " +wage_per_month);
    }
}
