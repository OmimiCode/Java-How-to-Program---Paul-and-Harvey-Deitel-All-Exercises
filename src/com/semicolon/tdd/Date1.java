



    /*( Date Class) Create a class called Date that includes three instance variables—a month (type a day (type int )
     and a year (type int ). Provide a constructor that initializes the three instance
    variables and assumes that the values provided are correct. Provide a set and a get method for each
    instance variable. Provide a method displayDate that displays the month, day and year separated
    by forward slashes ( / ). Write a test app named DateTest that demonstrates class Date ’s capabilities.*/
    package com.semicolon.tdd;

    public class Date1 {
        private int day;
        protected int month;
        private int year;


        public Date1(int day, int month, int year) {
            if (day >= 1 && day <= 31) {
                this.day = day;
            }

            if (month >= 1 && month <= 12) {
                this.month = month;
            }
            if (year >= 1000 && year <= 9999) {
                this.year = year;
            }
        }

        public int getDay() {
            return day;
        }

//        public void setDay(int day) {
//            if ((month==4 || month==6 || month==9 || month==11) && (day>=1 && day<=30)){
//                if(month ==2 && day>=1 && day<=28 && year%4!=0 ){//28days of february
//                    if(month ==2 && day>=1 && day<=29 && year%4==0 ) {//leap year
//                        this.day=day;
//                    }
//                }
//            }
//        }

        public void setDay(int day) {

                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day >= 1 && day <= 30) {
                        this.day = day;
                    } else {
                        System.out.println(" input valid day between 1 and 30 in this month");
                    }
                } else {
                    if (month == 2) {
                        if (year % 4 == 0) {
                            if (day >= 1 && day <= 29) {
                                this.day = day;
                            } else {
                                System.out.println("input valid day between 1 and 29 in this month -its a leap year");
                            }
                        } else {
                            if (month == 2) {
                                if (year % 4 != 0) {
                                    if (day >= 1 && day <= 28) {
                                        this.day = day;
                                    } else {
                                        System.out.println("input valid day between 1 and 28 in this month ");
                                    }
                                }
                            }
                        }
                    }
                }
            }

        public int getMonth() {

            return month;
        }

        public void setMonth(int month) {
            if (month >= 1 && month <= 12) {
                this.month = month;
            }
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            if (year >= 1000 && year <= 9999) {
                this.year = year;
            }

        }
//
        public String toString() {
            return day + "/" + month + "/" + year;
        }



    }
