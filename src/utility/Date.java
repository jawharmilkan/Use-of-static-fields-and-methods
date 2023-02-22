/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

/**
 *
 * @author jawha
 */
public class Date {
  private  int dat,month,year;

    public Date() {
    }

    public Date(int dat, int month, int year) {
        this.dat = dat;
        this.month = month;
        this.year = year;
    }

    public int getDat() {
        return dat;
    }

    public void setDat(int dat) {
        this.dat = dat;
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

    @Override
    public String toString() {
        return "Date{" + "dat=" + dat + ", month=" + month + ", year=" + year + '}';
    }
  
    
}
