/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marjaana
 */



import java.util.ArrayList;


public class Lastiruuma {

    private ArrayList<Matkalaukku> sisalto;

    private int maxpaino;



    public Lastiruuma(int maxpaino) {

        this.sisalto = new ArrayList<>();

        this.maxpaino = maxpaino;

    }

    

    public void lisaaMatkalaukku(Matkalaukku laukku) {

        int summa = 0;

        for (Matkalaukku i : this.sisalto) {

            summa += i.yhteispaino();

        }

        if (summa + laukku.yhteispaino() <= maxpaino) {

            this.sisalto.add(laukku);

        }

    }

    

    public void tulostaTavarat() {

        for (Matkalaukku i : this.sisalto) {

            i.tulostaTavarat();

        }

    }



    @Override

    public String toString() {

        int koko = this.sisalto.size();

        int summa = 0;

        for (Matkalaukku i : this.sisalto) {

            summa += i.yhteispaino();

        }

        return koko + " matkalaukkua (" + summa + " kg)";

    }

}
