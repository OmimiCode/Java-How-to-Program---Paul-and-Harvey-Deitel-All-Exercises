package com.semicolon.tdd;
/*3.16 (Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see that
        your heart rate stays within a safe range suggested by your trainers and doctors. According to the Amer-
        ican Heart Association (AHA) ( www.americanheart.org/presenter.jhtml?identifier=4736 ), the
        formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years.
        Your target heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are
        estimates provided by the AHA. Maximum and target heart rates may vary based on the health, fitness
        and gender of the individual. Always consult a physician or qualified health-care professional before
        beginning or modifying an exercise program.] Create a class called HeartRates . The class attributes
        should include the person’s first name, last name and date of birth (consisting of separate attributes for
        the month, day and year of birth). Your class should have a constructor that receives this data as pa-
        rameters. For each attribute provide set and get methods. The class also should include a method that
        calculates and returns the person’s age (in years), a method that calculates and returns the person’s
        maximum heart rate and a method that calculates and returns the person’s target heart rate. Write a
        Java app that prompts for the person’s information, instantiates an object of class HeartRates and
        prints the information from that object—including the person’s first name, last name and date of
        birth—then calculates and prints the person’s age in (years), maximum heart rate and target-heart-rate
        range.*/

public class TargetHeartRateCalculator {

    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;
    private String dateOfBirth;
    private int currentYear = 2020;
    private int currentAge;
    private int  maximumHeartRate;
    private double  targetHeartRate;


    public TargetHeartRateCalculator(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.dateOfBirth = dateOfBirth;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDateOfBirth() {
        return day + "/" + month + "/" + year;
    }


    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        currentAge = currentYear - year;
        return currentAge;
    }

    public void setAge(int age) {
        this.currentAge = age ;
    }


    public int getMaximumHeartRate() {
        maximumHeartRate = 220 - currentAge;
        return maximumHeartRate;
    }

    public void setMaximumHeartRate(int maximumHeartRate) {
        this.maximumHeartRate = maximumHeartRate;
    }

    public double  getTargetHeartRate() {
        targetHeartRate = (0.5*maximumHeartRate) - (0.85*maximumHeartRate);
        return targetHeartRate;
    }
    public void setTargetHeartRate(int targetHeartRate) {
        this.targetHeartRate = targetHeartRate;
    }



    }







