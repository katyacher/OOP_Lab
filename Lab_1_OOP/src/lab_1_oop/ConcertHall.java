/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1_oop;
import java.util.ArrayList;
/**
 *
 * @author kate
 */
public class ConcertHall {
    private String Name;
    //Реализация ассоциации, направленной в класс Concert, с мощностью n
    private ArrayList<Concert> grConcert;
    
    public ConcertHall(String pName) {
        this.Name = pName;
        this.grConcert = new ArrayList<Concert>();
    } 
    
    public ArrayList<Concert> getConcertArray() {
        return grConcert;
    }

    public String getName() {
        return Name;
    }

    public void setGrConcert(Concert grConcert) {
        this.grConcert.add(grConcert);
    }

    public Concert getConcert(int pos) {
        return grConcert.get(pos); //Возвращение ссылки связанного объекта по позиции в коллекции
    }
}
