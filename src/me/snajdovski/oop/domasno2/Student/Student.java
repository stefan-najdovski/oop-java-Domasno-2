package me.snajdovski.oop.domasno2.Student;

import me.snajdovski.oop.domasno2.Covek.Covek;

import java.util.ArrayList;

public class Student extends Covek {

    //Niza od ocenki
    public ArrayList<Ocenka> ocenki;


    public Student(String ime, String prezime, rasa rasaEnum, int godini, pol polEnum, float tezina, float visina, boolean daliEziv, String datumNaRaganje, nacionalost etnickaPripadnostEnum, ArrayList<Ocenka> ocenki) {
        super(ime, prezime, rasaEnum, godini, polEnum, tezina, visina, daliEziv, datumNaRaganje, etnickaPripadnostEnum);
        this.ocenki = ocenki;
    }
    public void SetOcenka(Ocenka o){
        ocenki.add(o);
    }
   public void GetProsek(){
        float prosek = 0;
        for (Ocenka o:ocenki) {
            prosek += o.getOcenka();
        }
        prosek /= ocenki.size();
        System.out.println("Prosekot na studentot e: " + prosek);
    }
}
