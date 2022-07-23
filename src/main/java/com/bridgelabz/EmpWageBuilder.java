package com.bridgelabz;

public class EmpWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program ");
     int IS_FULL_TIME = 1;
     int IS_PART_TIME = 2;
     int WAGE_PER_HR = 20;
     int FULL_TIME = 8;
     int PART_TIME = 4;

     double attendance = Math.floor(Math.random() * 10) % 3;
     if(attendance == IS_FULL_TIME) {
         System.out.println("Employee Wage = " + WAGE_PER_HR*FULL_TIME);
     }else if (attendance == IS_PART_TIME){
         System.out.println("Employee Wage = " + WAGE_PER_HR*PART_TIME);
     } else{
         System.out.println("Employee Wage = " + 0);
     }
    }
}
