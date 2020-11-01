/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1_oop;
import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 *
 * @author kate
 */
public class MainLab1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Concert PianoMusic; //Объявление переменной PianoMusic  
        
        PianoMusic = new Concert("Вечер фортепианной музыки", 
                                    new GregorianCalendar(2020,09,15,19), 
                                    "Ф. Шопен Концерт для фортепиано с оркестром №1"); //Создание объекта с инициализацией свойств
        
        Concert VocalMusic = new Concert("Вечер вокальной музыки", 
                                            new GregorianCalendar(2020,09,15,19),  
                                            "П.И. Чайковсикй Романсы и песни");    
        
        Concert SimphoMusic = new Concert("Вечер симфонической музыки", 
                                            new GregorianCalendar(2020,10,30,19), 
                                            "Л.В.Бетховен Симфония №9"); 
        

        System.out.println( SimphoMusic.getTitle() + " состоится " +  SimphoMusic.getDateOfConcert().get(Calendar.DAY_OF_MONTH) + "."
                                    + SimphoMusic.getDateOfConcert().get(Calendar.MONTH) + "."
                                    + SimphoMusic.getDateOfConcert().get(Calendar.YEAR) +  " м." 
                                    +"Начало концерта в  " + SimphoMusic.getDateOfConcert().get(Calendar.HOUR_OF_DAY) 
                                    + ", в программе " + SimphoMusic.getProgram());
        
        System.out.println(VocalMusic.getTitle() + " состоится " +  VocalMusic.getDateOfConcert().get(Calendar.DAY_OF_MONTH) + "."
                                    + VocalMusic.getDateOfConcert().get(Calendar.MONTH) + "."
                                    + VocalMusic.getDateOfConcert().get(Calendar.YEAR) +  " м." 
                                    +"Начало концерта в  " + SimphoMusic.getDateOfConcert().get(Calendar.HOUR_OF_DAY)  
                                    +", в программе " + VocalMusic.getProgram());
       
        System.out.println(PianoMusic.getTitle() + " состоится " +  PianoMusic.getDateOfConcert().get(Calendar.DAY_OF_MONTH) + "."
                                    + PianoMusic.getDateOfConcert().get(Calendar.MONTH) + "."
                                    + PianoMusic.getDateOfConcert().get(Calendar.YEAR) +  " м."
                                    + "Начало концерта в  " + SimphoMusic.getDateOfConcert().get(Calendar.HOUR_OF_DAY)
                                    +", в программе " + PianoMusic.getProgram());
   
     //Связывание объектов по ассоциациям классов
    ConcertHall Mkz = new ConcertHall("Малый концертный зал");
    ConcertHall Bkz = new ConcertHall("Большой концертный зал");
    Mkz.setGrConcert(PianoMusic); //Связывание объекта MKZ c объектом PianoMusic
    Mkz.setGrConcert(VocalMusic);
    Bkz.setGrConcert(SimphoMusic);
    
    Artist Art = new Artist("Денис", "Мацуев", "фортепиано", Mkz);//Создание объекта Art и связывание с объектом Mkz
    //Вывод информации по объекту Art и связанному с ним объекту группы
    
    System.out.println("Артист " + Art.getName() + " " + Art.getSurname()+ " " + Art.getSpecialty()+ Art.getStConcertHall().getName());
        
    System.out.println("Концерты Мкз:");
        //Перебор всех объектов коллекции концертов в свойстве grConcert объекта Mkz
    Mkz.getConcertArray().forEach(Concert -> 
            System.out.println(Concert.getTitle() + " " + Concert.getDateOfConcert().get(Calendar.DAY_OF_MONTH) + " "+
                                + Concert.getDateOfConcert().get(Calendar.MONTH)+ " "
                                + Concert.getDateOfConcert().get(Calendar.YEAR) + " " 
                                +Concert.getDateOfConcert().get(Calendar.HOUR_OF_DAY));
    }      
}
