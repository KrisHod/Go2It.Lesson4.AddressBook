package com.go2it.edu;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonthShortForm() {
        String monthShortForm = Month.of(month).getDisplayName(TextStyle.SHORT,Locale.CANADA);
        return monthShortForm;

    }public String getMonthLongForm() {
        String monthLongForm = Month.of(month).getDisplayName(TextStyle.FULL,Locale.CANADA);
        return monthLongForm;
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

    @Override
    public String toString() {
        return "MyDate {" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
