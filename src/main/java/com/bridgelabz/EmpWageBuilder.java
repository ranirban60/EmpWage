package com.bridgelabz;

public class EmpWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program ");
        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;
        int WAGE_PER_HR = 20;
        int FULL_TIME = 8;
        int PART_TIME = 4;

        double attendance = Math.floor(Math.random() * 10) % 3;
        switch ((int) attendance) {
            case IS_FULL_TIME -> {
                System.out.println("Employee Wage = " + WAGE_PER_HR * FULL_TIME);
                break;
            }
            case IS_PART_TIME -> {
                System.out.println("Employee Wage = " + WAGE_PER_HR * PART_TIME);
                break;
            }
            default -> {
                System.out.println("Employee Wage = " + 0);
            }
        }
    }
}
