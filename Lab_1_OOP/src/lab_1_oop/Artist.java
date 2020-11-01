/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1_oop;

/**
 *
 * @author kate
 */
public class Artist {
    private String Name;
    private String Surname;
    private String Specialty;
    private ConcertHall stConcertHall; //Реализация ассоциации в класс ConcertHall с мощностью 1
    
    public Artist(String pName, String pSurname, String pSpecialty, ConcertHall pConcertHall) {
        this.Name = pName;
        this.Surname = pSurname;
        this.Specialty = pSpecialty;
        this.stConcertHall = pConcertHall; // Связывание объектов
    }
    
    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public ConcertHall getStConcertHall() {
        return stConcertHall;//Возвращение ссылки на связанный объект
    }
}
