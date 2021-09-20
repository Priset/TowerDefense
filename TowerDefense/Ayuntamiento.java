package edu.upb.lp.progra.TowerDefense;

import java.util.LinkedList;
import java.util.Queue;

public class Ayuntamiento {

    private TowerDefenseGame game;
    private int vida = 3000;
    private int oro = 18000;
    private String soundOfDead;
    private String ayuntaQuemadoArriba;
    private String ayuntaQuemadoMedio;
    private String ayuntaQuemadoAbajo;

    private  final MovimientoTropa movimientoTropa = new MovimientoTropa(this);
    private  final AtacadorDeTorre atacadorDeTorre = new AtacadorDeTorre(this);

    private Queue<Tropa> enemigos1 = new LinkedList<Tropa>();
    private Queue<Tropa> enemigos2 = new LinkedList<Tropa>();
    private Queue<Tropa> enemigos3 = new LinkedList<Tropa>();

    public Ayuntamiento( String soundOfDead, String ayuntaQuemadoArriba, String ayuntaQuemadoMedio, String ayuntaQuemadoAbajo, TowerDefenseGame game) {
        this.soundOfDead = soundOfDead;
        this.ayuntaQuemadoArriba = ayuntaQuemadoArriba;
        this.ayuntaQuemadoMedio = ayuntaQuemadoMedio;
        this.ayuntaQuemadoAbajo = ayuntaQuemadoAbajo;
        this.game = game;
    }

    public void colaDeDuendes(){
        for(int i = 0; i < 10; i++) {
            enemigos1.offer(new Tropa("Duende",300, 10, 30,6,0, "tropa_tipo1", this));
        }
    }

    public void colaDeGolems(){
        for(int i = 0; i < 10; i++) {
            enemigos2.offer(new Tropa("Golem",500,25,50,7,0,"tropa_tipo3", this));
        }
    }

    public void colaDeOgros(){
        for(int i = 0; i < 10; i++) {
            enemigos3.offer(new Tropa("Ogro",950,50,70,8,0,"tropa_tipo4", this));
        }
    }

    public void empezar(){
            colaDeDuendes();
            colaDeGolems();
            colaDeOgros();
            movimientoTropa.start();
    }

    public void movimientoDuende(){
        if(game.getDireccionMatriz(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()+1, enemigos1.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()+2, enemigos1.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos1.peek().getCoordenadaV()-1,enemigos1.peek().getCoordenadaH()+2, enemigos1.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos1.peek().getCoordenadaV()-2,enemigos1.peek().getCoordenadaH()+2, enemigos1.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos1.peek().getCoordenadaV()-3,enemigos1.peek().getCoordenadaH()+2, enemigos1.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos1.peek().getCoordenadaV()-3,enemigos1.peek().getCoordenadaH()+3, enemigos1.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos1.peek().getCoordenadaV()-3,enemigos1.peek().getCoordenadaH()+4, enemigos1.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos1.peek().getCoordenadaV()-3,enemigos1.peek().getCoordenadaH()+5, enemigos1.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos1.peek().getCoordenadaV()-4,enemigos1.peek().getCoordenadaH()+5, enemigos1.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos1.peek().getCoordenadaV()-4,enemigos1.peek().getCoordenadaH()+6, enemigos1.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos1.peek().getCoordenadaV()-4,enemigos1.peek().getCoordenadaH()+7, enemigos1.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos1.peek().getCoordenadaV()-4,enemigos1.peek().getCoordenadaH()+8, enemigos1.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos1.peek().getCoordenadaV()-3,enemigos1.peek().getCoordenadaH()+8, enemigos1.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos1.peek().getCoordenadaV()-2,enemigos1.peek().getCoordenadaH()+8, enemigos1.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos1.peek().getCoordenadaV()-1,enemigos1.peek().getCoordenadaH()+8, enemigos1.peek().getImagenDeTropa());
            if(enemigos1.peek().getVida() <= 0){
                game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
                enemigos1.peek().darOroAlAyuntamiento();
            }
        }
    }

    public void movimientoGolem(){
        if(game.getDireccionMatriz(enemigos2.peek().getCoordenadaV(),enemigos2.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos2.peek().getCoordenadaV(),enemigos2.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos2.peek().getCoordenadaV(),enemigos2.peek().getCoordenadaH()+1, enemigos2.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos2.peek().getCoordenadaV(),enemigos2.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos2.peek().getCoordenadaV(),enemigos2.peek().getCoordenadaH()+2, enemigos2.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos2.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos2.peek().getCoordenadaV(),enemigos2.peek().getCoordenadaH()+3, enemigos2.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos2.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos2.peek().getCoordenadaV()-1,enemigos2.peek().getCoordenadaH()+3, enemigos2.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos2.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos2.peek().getCoordenadaV()-2,enemigos2.peek().getCoordenadaH()+3, enemigos2.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos2.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos2.peek().getCoordenadaV()-3,enemigos2.peek().getCoordenadaH()+3, enemigos2.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos2.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos2.peek().getCoordenadaV()-3,enemigos2.peek().getCoordenadaH()+4, enemigos2.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos2.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos1.peek().getCoordenadaV(),enemigos1.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos2.peek().getCoordenadaV()-3,enemigos2.peek().getCoordenadaH()+4, enemigos2.peek().getImagenDeTropa());
        }
    }

    public void movimientoOgro(){
        if(game.getDireccionMatriz(enemigos3.peek().getCoordenadaV(),enemigos3.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos2.peek().getCoordenadaV(),enemigos2.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos3.peek().getCoordenadaV(),enemigos3.peek().getCoordenadaH()+1, enemigos3.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos3.peek().getCoordenadaV(),enemigos3.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos2.peek().getCoordenadaV(),enemigos2.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos3.peek().getCoordenadaV(),enemigos3.peek().getCoordenadaH()+2, enemigos3.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos3.peek().getCoordenadaV(),enemigos3.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos2.peek().getCoordenadaV(),enemigos2.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos3.peek().getCoordenadaV(),enemigos3.peek().getCoordenadaH()+3, enemigos3.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos3.peek().getCoordenadaV(),enemigos3.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos2.peek().getCoordenadaV(),enemigos2.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos3.peek().getCoordenadaV(),enemigos3.peek().getCoordenadaH()+4, enemigos3.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos3.peek().getCoordenadaV(),enemigos3.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos2.peek().getCoordenadaV(),enemigos2.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos3.peek().getCoordenadaV()-1,enemigos3.peek().getCoordenadaH()+4, enemigos3.peek().getImagenDeTropa());
        }
        if(game.getDireccionMatriz(enemigos3.peek().getCoordenadaV(),enemigos3.peek().getCoordenadaH()) == 3){
            //game.borrarPosicionAnterior(enemigos2.peek().getCoordenadaV(),enemigos2.peek().getCoordenadaH());
            game.cambioDePosicion(enemigos3.peek().getCoordenadaV()-2,enemigos3.peek().getCoordenadaH()+4, enemigos3.peek().getImagenDeTropa());
        }

    }


    public  void iniciarMovimiento(){
        movimientoDuende();
        movimientoGolem();
        movimientoOgro();
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
            oro = 18000;
        }
    }

    public void bajarOro(int precio) {
        if(precio < 0){
            throw new IllegalArgumentException();
        }
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
        if(enemigos1.isEmpty() && enemigos2.isEmpty() && enemigos3.isEmpty()) {
            movimientoTropa.stop();
            atacadorDeTorre.stop();
            game.ganaste();
        }
    }

    public void executeLater(MovimientoTropa movimientoTropa) {
        int tiempo = 1000;
        game.executeLater(movimientoTropa, tiempo);
    }




    public void executeLaterTorre(AtacadorDeTorre atacadorDeTorre) {
        int tiempo = 3000;
        game.executeLater(atacadorDeTorre, tiempo);
    }


}
