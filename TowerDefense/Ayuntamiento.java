package edu.upb.lp.progra.TowerDefense;

import java.util.LinkedList;
import java.util.Queue;

public class Ayuntamiento {

    private TowerDefenseGame game;
    private MovimientoTropa movimientoTropa;
    private AtacadorDeTorre atacadorDeTorre;
    private int vida = 3000;
    private int oro = 1000;
    private String soundOfDead;
    private String ayuntaQuemadoArriba;
    private String ayuntaQuemadoMedio;
    private String ayuntaQuemadoAbajo;
    private Tropa tropa;
    private Queue<Tropa> enemigos = new LinkedList<Tropa>();
/*
    Tropa enemigo1;
    Tropa enemigo2;
    Tropa enemigo3;
    Tropa enemigo4;
    Tropa enemigo5;
    Tropa enemigo6;
    Tropa enemigo7;
    Tropa enemigo8;
    Tropa enemigo9;
    Tropa enemigo10;
 */

    public Ayuntamiento( String soundOfDead, String ayuntaQuemadoArriba, String ayuntaQuemadoMedio, String ayuntaQuemadoAbajo, TowerDefenseGame game) {
        this.soundOfDead = soundOfDead;
        this.ayuntaQuemadoArriba = ayuntaQuemadoArriba;
        this.ayuntaQuemadoMedio = ayuntaQuemadoMedio;
        this.ayuntaQuemadoAbajo = ayuntaQuemadoAbajo;
        this.game = game;
        colaDeDuendes();
        colaDeGolems();
        colaDeOgros();
    }

    public void colaDeDuendes(){
        for(int i = 0; i < 20; i++) {
            enemigos.offer(new Tropa("Duende",300, 10, 30, "tropa_tipo1"));
        }
    }

    public void colaDeGolems(){
        for(int i = 0; i < 30; i++) {
            enemigos.offer(new Tropa("Golem",500,25,50,"tropa_tipo3"));
        }
    }

    public void colaDeOgros(){
        for(int i = 0; i < 30; i++) {
            enemigos.offer(new Tropa("Ogro",950,50,70,"tropa_tipo4"));
        }
    }

    public  void iniciarMovimiento(){
        tropa.darPaso();
    }

    /*  
    public void enemigosActivos(){
        Tropa enemigo1 = null;
        Tropa enemigo2 = null;
        Tropa enemigo3 = null;
        Tropa enemigo4 = null;
        Tropa enemigo5 = null;
        Tropa enemigo6 = null;
        Tropa enemigo7 = null;
        Tropa enemigo8 = null;
        Tropa enemigo9 = null;
        Tropa enemigo10 = null;
        if(enemigo1 == null) {
            enemigo1 = enemigos.poll();
        } else {
            iniciarMovimiento(enemigo1);
        }
        if (enemigo2 == null){
            enemigo2 = enemigos.poll();
        }else {
            iniciarMovimiento(enemigo2);
        }
        if (enemigo3 == null){
            enemigo3 = enemigos.poll();
        }else {
            iniciarMovimiento(enemigo3);
        }
        if (enemigo4 == null){
            enemigo4 = enemigos.poll();
        }else {
            iniciarMovimiento(enemigo4);
        }
        if (enemigo5 == null){
            enemigo5 = enemigos.poll();
        }else {
            iniciarMovimiento(enemigo5);
        }
        if (enemigo6 == null){
            enemigo6 = enemigos.poll();
        }else {
            iniciarMovimiento(enemigo6);
        }
        if (enemigo7 == null){
            enemigo7 = enemigos.poll();
        }else {
            iniciarMovimiento(enemigo7);
        }
        if (enemigo8 == null){
            enemigo8 = enemigos.poll();
        }else {
            iniciarMovimiento(enemigo8);
        }
        if (enemigo9 == null){
            enemigo9 = enemigos.poll();
        }else {
            iniciarMovimiento(enemigo9);
        }
        if (enemigo10 == null){
            enemigo10 = enemigos.poll();
        }else {
            iniciarMovimiento(enemigo10);
        }
    }
    */


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
            oro = 1000;
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



    public void partidaPerdida(){
        if(vida <= 0){
            game.perdiste();
            movimientoTropa.stop();
            atacadorDeTorre.stop();
        }
    }

    public void pocaVidaRestante(){
        if(vida == 1500){
            game.ayuntamientoQuemandose();
        }
    }

    public void partidaGanada(){
        if(enemigos == null) {
            movimientoTropa.stop();
            atacadorDeTorre.stop();
            game.ganaste();
        }
    }
}
