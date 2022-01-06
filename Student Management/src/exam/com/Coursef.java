/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.com;

/**
 *
 * @author RAIN DROPS IT
 */
public class Coursef {

    private String label;
    private int hour;
    private int coursefee;
    private double discount;
   

    public Coursef() {
    }

    public Coursef(String label, int hour, int coursefee, double discount) {
        this.label = label;
        this.hour = hour;
        this.coursefee = coursefee;
        this.discount = discount;
       
    }

   

   

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getCoursefee() {
        return coursefee;
    }

    public void setCoursefee(int coursefee) {
        this.coursefee = coursefee;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    

}
