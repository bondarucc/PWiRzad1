/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author serz
 */
public class ProducentKonsumentPD {
    public static void main(String args[]) {
        Pojemnik poj = new Pojemnik();
        Producent prod = new Producent(poj);
        DrugiProducent drProd = new DrugiProducent(poj);
        Konsument kons = new Konsument(poj);
        Thread watek1 = new Thread(prod);
        Thread watek2 = new Thread(drProd);
        Thread watek3 = new Thread(kons);
        Thread watek4 = new Thread(kons);
        Thread watek5 = new Thread(kons);
        watek1.start();
        watek2.start();
        watek3.start();
        watek4.start();
        watek5.start();
    }
}
