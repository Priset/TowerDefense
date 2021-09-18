package edu.upb.lp.progra.TowerDefense;

import java.util.LinkedList;
import java.util.List;

public class Ayuntamiento {

    private TowerDefenseGame game;
    private int vida = 3000;
    private int oro = 5000;
    private String soundOfDead;
    private String ayuntaQuemadoArriba;
    private String ayuntaQuemadoMedio;
    private String ayuntaQuemadoAbajo;


    public Ayuntamiento( String soundOfDead, String ayuntaQuemadoArriba, String ayuntaQuemadoMedio, String ayuntaQuemadoAbajo, TowerDefenseGame game) {
        this.soundOfDead = soundOfDead;
        this.ayuntaQuemadoArriba = ayuntaQuemadoArriba;
        this.ayuntaQuemadoMedio = ayuntaQuemadoMedio;
        this.ayuntaQuemadoAbajo = ayuntaQuemadoAbajo;
        this.game = game;
    }


    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {

        this.vida = vida;
    }

    public int getOro() {

        return oro;
    }

    public void setOro(int oro) {

        this.oro = oro;
    }

    public void resetOro(){
        if(oro >= 0){
            oro = 5000;
        }
    }

    public void bajarOro(int precio) {
        if(oro >= precio){
            oro -= precio;
        }
    }

    public void bajarOroDeMejora(int precioDeMejora) {
        if(oro >= precioDeMejora){
            oro -= precioDeMejora;
        }
    }

    public void bajarVidaDelAyuntamiento(int danio){
        vida -= danio;
    }

    public void recibirDanio(){

    }


}
