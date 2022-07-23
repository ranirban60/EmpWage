package com.bridgelabz;

public class EmpWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program ");
     int IS_FULL_TIME = 1;
     int WAGE_PER_HR = 20;
     int FULL_TIME = 8;
     int NO_TIME = 0;

     int attendance = (int)Math.floor(Math.random() * 10) % 2;
     if(attendance == IS_FULL_TIME) {
         System.out.println("Employee Wage = " + WAGE_PER_HR*FULL_TIME);
     }else{
         System.out.println("Employee Wage = " + WAGE_PER_HR*NO_TIME);
     }
    }
}
