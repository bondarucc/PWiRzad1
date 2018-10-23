
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author serz
 */
public class Pojemnik {
    private ArrayList liczby = new ArrayList(4);
    private ArrayList literki = new ArrayList(4);
    synchronized public void wstawLiczbe(int liczba) {
        if (this.liczby.size() > 3) {
            try {
                wait();
            }
            catch (InterruptedException e) {}
        }
        System.out.println("Do pojemnika wstawiana jest liczba: " + liczba);
        this.liczby.add(liczba);
        notify();
    }
    synchronized public void wstawLiterke(int literka) {
        if (this.literki.size() > 3) {
            try {
                wait();
            }
            catch (InterruptedException e) {}
        }
        System.out.println("Do pojemnika wstawiana jest literka: " + (char)(literka));
        this.literki.add((char)(literka));
        notify();
    }
    synchronized public void pobierz() {
        while (true) {
            if (this.liczby.size() == 0 || this.literki.size() == 0) {
            try {
                wait();
            }
            catch (InterruptedException e) {}
            } else {
                System.out.println("Z pojemnika pobierana jest liczba: " + liczby.remove(liczby.size() - 1));
                System.out.println("Z pojemnika pobierana jest literka: " + (char)literki.remove(literki.size() - 1));
                notify();
                break;
            }
        }
    }
}