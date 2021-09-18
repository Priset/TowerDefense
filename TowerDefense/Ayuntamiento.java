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
    private Queue<Tropa> enemigos = new LinkedList<Tropa>();

    private Tropa enemigo1;
    private Tropa enemigo2;
    private Tropa enemigo3;
    private Tropa enemigo4;
    private Tropa enemigo5;
    private Tropa enemigo6;
    private Tropa enemigo7;
    private Tropa enemigo8;
    private Tropa enemigo9;
    private Tropa enemigo10;

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

    public  void iniciarMovimiento(Tropa tropa, int vertical, int horizontal){
        tropa.recorrido(vertical, horizontal);
    }

    public void enemigosActivos(){
        if(enemigo1 == null) {
            enemigo1 = enemigos.poll();
        }
        iniciarMovimiento(enemigo1,6,0);
        if (enemigo2 == null){
            enemigo2 = enemigos.poll();
        }
        iniciarMovimiento(enemigo2,6,0);
        if (enemigo3 == null){
            enemigo3 = enemigos.poll();
        }
        iniciarMovimiento(enemigo3,6,0);
        if (enemigo4 == null){
            enemigo4 = enemigos.poll();
        }
        iniciarMovimiento(enemigo4,6,0);
        if (enemigo5 == null){
            enemigo5 = enemigos.poll();
        }
        iniciarMovimiento(enemigo5,6,0);
        if (enemigo6 == null){
            enemigo6 = enemigos.poll();
        }
        iniciarMovimiento(enemigo6,7,0);
        if (enemigo7 == null){
            enemigo7 = enemigos.poll();
        }
        iniciarMovimiento(enemigo7,7,0);
        if (enemigo8 == null){
            enemigo8 = enemigos.poll();
        }
        iniciarMovimiento(enemigo8,7,0);
        if (enemigo9 == null){
            enemigo9 = enemigos.poll();
        }
        iniciarMovimiento(enemigo9,8,0);
        if (enemigo10 == null){
            enemigo10 = enemigos.poll();
        }
        iniciarMovimiento(enemigo10,8,0);
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
        //TODO HACER UN IF PARA ENTRAR AL METODO GAME.GANASTE
        movimientoTropa.stop();
        atacadorDeTorre.stop();
        game.ganaste();
    }
}
