package me.snajdovski.oop.domasno2.Student;

public class Ocenka {
    public String datumNaIspit;
    public String predmet;
    public float ocenka;


    public Ocenka(String datumNaIspit, String predmet, float ocenka) {
        this.datumNaIspit = datumNaIspit;
        this.predmet = predmet;
        this.ocenka = ocenka;
    }

    public String getDatumNaIspit() {
        return datumNaIspit;
    }

    public void setDatumNaIspit(String datumNaIspit) {
        this.datumNaIspit = datumNaIspit;
    }

    public float getOcenka() {
        return ocenka;
    }


   public void setOcenka(float ocenka) {
            this.ocenka = ocenka;

    }

    public String getDatum() {
        return datumNaIspit;
    }

    public void setDatum(String datumNaIspit) {
        this.datumNaIspit = datumNaIspit;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String toString(){
        return " Datum na ispit: " + datumNaIspit + " Predmet: " + predmet + " Ocenka: " + ocenka + " ";
    }
}
