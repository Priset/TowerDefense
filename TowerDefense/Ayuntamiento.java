package edu.upb.lp.progra.TowerDefense;

public class Ayuntamiento {

    private TowerDefenseGame game;
    private int vida = 3000;
    private int oro = 1000;
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
        }
    }

    public void pocaVidaRestante(){
        if(vida == 1500){
            game.ayuntamientoQuemandose();
        }
    }

    public void partidaGanada(){
        //TODO HACER UN IF PARA ENTRAR AL METODO GAME.GANASTE
        game.ganaste();
    }
}
