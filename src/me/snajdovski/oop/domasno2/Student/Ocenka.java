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

    /***
     * @this.ocenka e -1 ako ima greska vo vnesuvanjeto na ocenkata t.e ne e vo rangot od 5 do 10
     */
   public void setOcenka(float ocenka) {
        if(ocenka < 5 || ocenka > 10) {
            System.out.println("Ocenkata mora da e od 5 do 10");
            this.ocenka = -1;
        } else {
            this.ocenka = ocenka;
        }

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
