package tudelft.leapyear;

import java.time.LocalDate;

public class LeapYear {

    public boolean isLeapYear(int year) {
        if ( year % 400 == 0)
            return true;
        if ( year % 100 == 0)
            return false;
        return  ( year % 4 == 0 ) ? true : false;
    }

    public static void main(String args[]) {
        LocalDate localDate = LocalDate.of(-2000,1,1);
        System.out.println(localDate.isLeapYear());
    }
}
