/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1_oop;
import java.util.Calendar;
import java.util.GregorianCalendar;



/**
 *
 * @author kate
 */
public class Concert {
    private String Title;
    private Calendar DateOfConcert;
    private String Program;
    
    public Concert(String pTitle, Calendar pDateOfConcert, String pProgram) {
        this.Title = pTitle;
        this.DateOfConcert = pDateOfConcert;
        this.Program = pProgram;
    }

    public String getTitle() {
        return Title;
    }

    public Calendar getDateOfConcert() {
        return DateOfConcert;
    }
    
    public String getProgram() {
        return Program;
    }
    
     public void setTitle(String Title) {
        this.Title = Title;
    }
}
