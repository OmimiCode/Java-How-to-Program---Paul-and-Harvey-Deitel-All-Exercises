package chapter8;

import java.util.Date;

public class DateToString extends Date {
    public static void main(String[] args){
//        Date date = new Date(2, 7, 1996);
//        System.out.println(date);

        Date1ExtendedInheritance date = new Date1ExtendedInheritance(1,1,0,0);
        System.out.println(date.toString());
    }
}
