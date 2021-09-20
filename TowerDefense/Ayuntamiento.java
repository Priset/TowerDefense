package edu.upb.lp.progra.TowerDefense;

import java.util.LinkedList;
import java.util.Queue;

public class Ayuntamiento {

    private TowerDefenseGame game;
    private int vida = 3000;
    private int oro = 3000;
    private String soundOfDead;
    private String ayuntaQuemadoArriba;
    private String ayuntaQuemadoMedio;
    private String ayuntaQuemadoAbajo;

    private Queue<Tropa> enemigos = new LinkedList<Tropa>();

    private MovimientoTropa movimientoTropa = new MovimientoTropa(this);

    private AtacadorDeTorre atacadorDeTorre = new AtacadorDeTorre(this);

    public Ayuntamiento( String soundOfDead, String ayuntaQuemadoArriba, String ayuntaQuemadoMedio, String ayuntaQuemadoAbajo, TowerDefenseGame game) {
        this.soundOfDead = soundOfDead;
        this.ayuntaQuemadoArriba = ayuntaQuemadoArriba;
        this.ayuntaQuemadoMedio = ayuntaQuemadoMedio;
        this.ayuntaQuemadoAbajo = ayuntaQuemadoAbajo;
        this.game = game;
    }

    public void colaDeDuendes(){
        for(int i = 0; i < 10; i++) {
            enemigos.offer(new Tropa("Duende",10, 10, 30, "tropa_tipo1"));
        }
    }

    public void colaDeGolems(){
        for(int i = 0; i < 10; i++) {
            enemigos.offer(new Tropa("Golem",500,25,50,"tropa_tipo3"));
        }
    }

    public void colaDeOgros(){
        for(int i = 0; i < 10; i++) {
            enemigos.offer(new Tropa("Ogro",950,50,70,"tropa_tipo4"));
        }
    }

    public void empezar(){
        colaDeDuendes();
        colaDeGolems();
        colaDeOgros();
        movimientoTropa.stop();
        movimientoTropa = new MovimientoTropa(this);
        movimientoTropa.start();
    }

    public  void iniciarMovimiento( int vertical,int horizontal, String imagen){
        game.borrarPosicionAnterior(vertical,horizontal);
        game.cambioDePosicion(vertical,horizontal+1, imagen);
        if(enemigos.peek().getVida() <= 0){
            game.borrarPosicionAnterior(vertical,horizontal);
            enemigos.peek().darOroAlAyuntamiento();
        }
    }


    public void tropasRecibirDanio(int danio){

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
            oro = 3000;
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

    public void executeLater(MovimientoTropa movimientoTropa) {
        int tiempo = 3000;
        game.executeLater(movimientoTropa, tiempo);
    }

    public void executeLaterTorre(AtacadorDeTorre atacadorDeTorre) {
        int tiempo = 3000;
        game.executeLater(atacadorDeTorre, tiempo);
    }


}
