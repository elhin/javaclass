package Chapter10;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class MyDate {
    private int year = 0;
    private int month = 0;
    private int day = 0;
    private long elapsedTime;

    //current date
    public MyDate(){
        Calendar cal = new GregorianCalendar();
        this.year = cal.get(Calendar.YEAR);
        this.month = cal.get(Calendar.MONTH);
        this.day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Today is the " + day + " day of the " + month + " month of the year " + year);
    }

    //specified elapsed time since jan 1 1970 in ms
    public MyDate(long elapsedTime){
        setDate(elapsedTime);
    }

    //specified year month day
    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //three getter methods (done)
    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public void setDate(long elapsedTime){
        Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        this.year = cal.get(GregorianCalendar.YEAR);
        this.month = cal.get(GregorianCalendar.MONTH);
        this.day = cal.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Today is the " + day + " day of the " + month + " month of the year " + year);
    }
    //method setDate(long elapsedTime) - sets new date for object using elapsed time
}
