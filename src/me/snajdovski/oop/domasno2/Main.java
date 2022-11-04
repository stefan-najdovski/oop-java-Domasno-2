package me.snajdovski.oop.domasno2;

import me.snajdovski.oop.domasno2.Covek.Covek;
import me.snajdovski.oop.domasno2.Student.Ocenka;
import me.snajdovski.oop.domasno2.Student.Student;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author by Stefan Najdovski
 * @version 1.0
 * @date 04/11/22.
 */

public class Main {
    public static void main(String[] args) {

        Ocenka o1 = new Ocenka("21.11.2022", "OOP", 8);

        Ocenka o2 = new Ocenka("22.11.2022", "PKM", 6);
        Ocenka o3 = new Ocenka("23.11.2022", "Algoritmi", 10);
        Ocenka o4 = new Ocenka("25.11.2022", "Organizacisko Pretpriemnistvo", 7);

        //bez o1 za da se testira so .SetOcenka metodot

        ArrayList<Ocenka> ocenki = new ArrayList<Ocenka>(Arrays.asList(o2, o3, o4));
        Student covekNekoj = new Student("Nekoj", "Nekojovski", Covek.rasa.Bela, 21, Covek.pol.Masko, 70, 182, true, "1999-12-12", Covek.nacionalost.Makedonska, ocenki);
        System.out.println("Ocenki pred dodavanje na nova ocenka");
        System.out.println(covekNekoj.ocenki);
        covekNekoj.GetProsek();
        //Dodavanje na nov element vo nizata OOP vo ovoj slucaj za test
        covekNekoj.SetOcenka(o1);
        System.out.println("Ocenki potoa so OOP (o1 objektot vo nizata:Ocenka@" + o1.hashCode());

        System.out.println(covekNekoj.ocenki);
        covekNekoj.GetProsek();

    }
}