package me.snajdovski.oop.domasno2;

/**
 * @author Stefan Najdovski
 * @version 1.0
 * @date 04-12-22
 * @description Klasata e nameneta za reprezentacija na covek so osnovni atributi.
 */
import java.util.Date;

public class Covek {

    public String ime,prezime,rasa;
    public int godini;

    /***
     * @param ime Ime na covekot
     * @param prezime   Prezime na covekot
     * @param rasa  Rasa na covekot
     * @param godini   Godini na covekot
     * @param pol Pol na covekot, tip int za pol, 1 za masko, 2 za zensko, 3 za druga opredelba
     * @param tezina  Tezina na covekot izrazena vo kilogrami (float)
     * @param visina Visina na covekot izrazena vo centimetri (float)
     * @param ziv   Dali covekot e ziv, boolean vrednost (true/false) true = ziv, false = mrtov
     * @param datumNaRaganje Datum na raganje na covekot vo formatot "YYYY-MM-DD"
     */
    public int pol;
    public float tezina,visina;
    public boolean daliEziv;
    public String datumNaRaganje;
   public enum nacionalost {Makedonec,Albanec,Srbin,Bugarin,Vlav,Drugo};

    public Covek(String ime, String prezime, String rasa, int godini, int pol, float tezina, float visina, boolean daliEziv, String datumNaRaganje, enum nacionalost) {
        this.ime = ime;
        this.prezime = prezime;
        this.rasa = rasa;
        this.godini = godini;
        this.pol = pol;
        this.tezina = tezina;
        this.visina = visina;
        this.daliEziv = daliEziv;
        this.datumNaRaganje = datumNaRaganje;
        this.nacionalost = nacionalost;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getRasa() {
        return rasa;
    }

    public int getGodini() {
        return godini;
    }

    public int getPol() {
        return pol;
    }

    public float getTezina() {
        return tezina;
    }

    public float getVisina() {
        return visina;
    }

    public boolean isDaliEziv() {
        return daliEziv;
    }

    public String getDatumNaRaganje() {
        return datumNaRaganje;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public void setGodini(int godini) {
        this.godini = godini;
    }

    public void setPol(int pol) {
        this.pol = pol;
    }

    public void setTezina(float tezina) {
        this.tezina = tezina;
    }

    public void setVisina(float visina) {
        this.visina = visina;
    }

    public void setDaliEziv(boolean daliEziv) {
        this.daliEziv = daliEziv;
    }

    public void setDatumNaRaganje(String datumNaRaganje) {
        this.datumNaRaganje = datumNaRaganje;
    }

    @Override
    public String toString() {
    return "Covek Object " + "ime= " + ime  + ", prezime=" + prezime + " rasa= " + rasa + "  godini= " + godini + " pol=" + pol + " tezina=" + tezina + " visina=" + visina + " daliEziv=" + daliEziv + " datumNaRaganje=" + datumNaRaganje;
    }
}
