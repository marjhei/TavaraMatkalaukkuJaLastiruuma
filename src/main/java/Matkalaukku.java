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




public class Matkalaukku {

    private int maxpaino;

    private ArrayList<Tavara> sisalto;



    public Matkalaukku(int maxpaino) {

        this.maxpaino = maxpaino;

        this.sisalto = new ArrayList<>();

    }

    

    public void lisaaTavara(Tavara tavara) {

        int summa = 0;

        for (Tavara i : this.sisalto) {

            summa += i.getPaino();

        }

        if (summa + tavara.getPaino() <= maxpaino) {

            this.sisalto.add(tavara);

        }

    }

    

    public void tulostaTavarat() {

        for (Tavara i : this.sisalto) {

            System.out.println(i.toString());

        }

    }

    

    public int yhteispaino() {

        int summa = 0;

        for (Tavara i : this.sisalto) {

            summa += i.getPaino();

        }

        return summa;

    }

    

    public Tavara raskainTavara() {

        if (!this.sisalto.isEmpty()) {

            int raskainPaino = 0;

            int vertailuPaino = 0;

            Tavara raskainTavara = this.sisalto.get(0);

            for (Tavara i : this.sisalto) {

                vertailuPaino = i.getPaino();

                if (vertailuPaino > raskainPaino) {

                    raskainPaino = vertailuPaino;

                    raskainTavara = i;

                }

            }

            return raskainTavara;

        }

        return null;

    }



  

    public String toString() {

        

        int koko = this.sisalto.size();

        

        if (koko == 0) {

            return "ei tavaroita (0kg)";

        } else if (koko == 1) {

            return koko + " tavara (" + this.yhteispaino() + " kg)";

        } else {

            return koko + " tavaraa (" + this.yhteispaino() + " kg)";

        }

    }

    

}