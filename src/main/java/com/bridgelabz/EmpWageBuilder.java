package com.bridgelabz;

public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String companyName;
    private final int wagePerHr;
    private final int maxWorkingDays;
    private final int maxWorkingHours;
    private int totalEmpWage ;

    public EmpWageBuilder(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHr = wagePerHr;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program ");
        EmpWageBuilder amazon = new EmpWageBuilder("Amazon",30, 25, 200);
        EmpWageBuilder flipkart = new EmpWageBuilder("Flipkart",20, 20, 150);
        amazon.totalEmpWage();
        System.out.println(amazon);
        flipkart.totalEmpWage();
        System.out.println(flipkart);
        }

    public void  totalEmpWage() {
        int emp_hr = 0;
        int totalWorkingHrs = 0;
        int totalWorkingDays = 0;

        System.out.println("Employee of " + companyName);
        System.out.println("Wage per hour " + wagePerHr);
        System.out.println("Maximum working days " + maxWorkingDays);
        System.out.println("Maximum working hours " + maxWorkingHours + "\n");


        while (totalWorkingHrs <= maxWorkingHours && totalWorkingDays < maxWorkingDays) {
            totalWorkingDays++;
            double attendance = Math.floor(Math.random() * 10) % 3;
            switch ((int) attendance) {
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
        totalEmpWage = wagePerHr * totalWorkingHrs;
       System.out.println();
       System.out.println("No of Total Working Hrs in the month is " + totalWorkingHrs);
       System.out.println("Total wage for a month of the " + companyName + " employee is " + totalEmpWage + "\n");
    }
    @Override
    public String toString() {
        return "Total wage for a month of the " + companyName + " employee is " + totalEmpWage;
    }
}


