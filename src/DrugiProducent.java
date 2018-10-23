/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author serz
 */
public class DrugiProducent implements Runnable {
    Pojemnik p;
    DrugiProducent(Pojemnik poj) {
        this.p = poj;
    }
    public void run() {
        for (int i=1; i<=10; i++) {
            try {
                Thread.sleep((int)(100*Math.random()));
            }
            catch (InterruptedException e) {}
            p.wstawLiterke(64 + i);
        }
    }
}
