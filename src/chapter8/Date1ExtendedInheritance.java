package chapter8;

import com.semicolon.tdd.Date1;

public class Date1ExtendedInheritance extends Date1 {

    private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    private final int newParameterInConstructor;

    /*  A subclass can invoke a constructor of its superclass by using the keyword super , followed by a
        set of parentheses containing the superclass constructor arguments. This must appear as the first
        statement in the subclass constructor’s body.*/
    public Date1ExtendedInheritance(int day, int month, int year, int newParameterInConstructor) {
        super(day, month, year);
        // check if month in range
        if (month <= 0 || month > 12) throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        // check if day in range for month
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
// check for leap year if month is 2 and day is 29
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        System.out.printf("Date object constructor for date %s%n", this);

        this.newParameterInConstructor = newParameterInConstructor;
    }

    @Override
    public void setMonth(int month) {
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        super.setMonth(month);
    }

    @Override
    public void setDay(int day) {
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day +
                    ") out-of-range for the specified month and year");
        super.setDay(day);
    }


    @Override
    //toString() method
    public String toString() {
            return String.format("%d/%d/%d ",getDay(),getMonth(),getYear());
        }
    }

