package edu.upb.lp.progra.TowerDefense;

import java.security.Principal;

public class Tropa {

    private TowerDefenseGame game;
    private Ayuntamiento ayuntamiento;
    private String tipoDeTropa;
    private int vida;
    private int danio;
    private int oroAlMorir;
    private String imagenDeTropa;
    private int coordenadaV;
    private int coordenadaH;
    private int direccion;
    private final MovimientoTropa moveT = new MovimientoTropa(this);

    public Tropa(String tipoDeTropa, int vida, int danio, int oroAlMorir, String imagenDeTropa) {
        this.tipoDeTropa = tipoDeTropa;
        this.vida = vida;
        this.danio = danio;
        this.oroAlMorir = oroAlMorir;
        this.imagenDeTropa = imagenDeTropa;
    }

    public int getVida() {
        return vida;
    }

    public int getDanio() {
        return danio;
    }

    public int getOroAlMorir() {
        return oroAlMorir;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCoordenadaV() {
        return coordenadaV;
    }

    public int getCoordenadaH() {
        return coordenadaH;
    }

   /*
    public void recorrido(int vertical, int horizontal) {
        moveT.comenzarRecorrido(vertical, horizontal);
        if(vertical == 6 && horizontal == 0){
            primerRecorrido(vertical,horizontal);
        } else if(vertical == 7 && horizontal == 0){
            segundoRecorrido(vertical,horizontal);
        } else if(vertical == 8 && horizontal == 0){
            tercerRecorrido(vertical,horizontal);
        }
        moveT.start();
    }

    */

    public void darPaso() {
        //game.borrar();
        game.borrarPosicionAnterior(coordenadaV,coordenadaH);
        game.darDireccion(coordenadaV, coordenadaH, direccion);
        if (direccion == 3) { //derecha (d)
            coordenadaH++;
        }
        if (direccion == 2) { //abajo (s)
            coordenadaV++;
        }
        if (direccion == 1) { //arriba (w)
            coordenadaV--;
        }
        game.cambioDePosicion(coordenadaV, coordenadaH, imagenDeTropa);
        moveT.start();
    }

    //TODO CAMBIAR COODENADA DESPUES QUE SE BORRA "COORDENADAH +1"
    //TODO ENVIAR POSICION NUEVA
    //TODO BORRAR IMAGEN CMABIAR POSICION Y REDIBUJAR EN NUEVA POSICION
    /*
    public void primerRecorrido(int vertical, int horizontal){
        for(int i = 1; i < 2;i++){
            coordenadaH = coordenadaH +1;
            game.borrarPosicionAnterior(vertical,horizontal);
            game.cambioDePosicion(vertical,horizontal, imagenDeTropa);
        }
        for(int i = 1; i < 3;i++){
            coordenadaV = coordenadaV -1;
            game.borrarPosicionAnterior(vertical,horizontal);
            game.cambioDePosicion(vertical,horizontal, imagenDeTropa);
        }
        for(int i = 1; i < 3;i++){
            derecha();
            game.borrarPosicionAnterior(vertical,horizontal);
            game.cambioDePosicion(vertical,horizontal, imagenDeTropa);
        }
        arriba();
        for(int i = 1; i < 3;i++){
            derecha();
            game.borrarPosicionAnterior(vertical,horizontal);
            game.cambioDePosicion(vertical,horizontal, imagenDeTropa);
        }
        for(int i = 1; i < 4;i++){
            coordenadaV = coordenadaV +1;
            game.borrarPosicionAnterior(vertical,horizontal);
            game.cambioDePosicion(vertical,horizontal, imagenDeTropa);
        }
        for(int i = 1; i < 2;i++){
            derecha();
            game.borrarPosicionAnterior(vertical,horizontal);
            game.cambioDePosicion(vertical,horizontal, imagenDeTropa);
        }
    }

    public void segundoRecorrido(int vertical, int horizontal){
        for(int i = 1; i < 3;i++){
            derecha();
            game.borrarPosicionAnterior(vertical,horizontal);
            game.cambioDePosicion(vertical,horizontal, imagenDeTropa);
        }
        for(int i = 1; i < 3;i++){
            arriba();
            game.borrarPosicionAnterior(vertical,horizontal);
            game.cambioDePosicion(vertical,horizontal, imagenDeTropa);
        }
        for(int i = 1; i < 3;i++){
            derecha();
            game.borrarPosicionAnterior(vertical,horizontal);
            game.cambioDePosicion(vertical,horizontal, imagenDeTropa);
        }
        arriba();
        game.borrarPosicionAnterior(vertical,horizontal);
        game.cambioDePosicion(vertical,horizontal, imagenDeTropa);
        derecha();
        game.borrarPosicionAnterior(vertical,horizontal);
        game.cambioDePosicion(vertical,horizontal, imagenDeTropa);
        for(int i = 1; i < 4;i++){
            abajo();
            game.borrarPosicionAnterior(vertical,horizontal);
            game.cambioDePosicion(vertical,horizontal, imagenDeTropa);
        }
        for(int i = 1; i < 3;i++){
            derecha();
            game.borrarPosicionAnterior(vertical,horizontal);
            game.cambioDePosicion(vertical,horizontal, imagenDeTropa);
        }
    }

    public void tercerRecorrido(int vertical, int horizontal){
        for(int i = 1; i < 4;i++){
            derecha();
            game.borrarPosicionAnterior(vertical,horizontal);
            game.cambioDePosicion(vertical,horizontal, imagenDeTropa);
        }
        for(int i = 1; i < 3;i++){
            arriba();
            game.borrarPosicionAnterior(vertical,horizontal);
            game.cambioDePosicion(vertical,horizontal, imagenDeTropa);
        }
        for(int i = 1; i < 2;i++){
            derecha();
            game.borrarPosicionAnterior(vertical,horizontal);
            game.cambioDePosicion(vertical,horizontal, imagenDeTropa);
        }
        for(int i = 1; i < 3;i++){
            abajo();
            game.borrarPosicionAnterior(vertical,horizontal);
            game.cambioDePosicion(vertical,horizontal, imagenDeTropa);
        }
        for(int i = 1; i < 4;i++){
            derecha();
            game.borrarPosicionAnterior(vertical,horizontal);
            game.cambioDePosicion(vertical,horizontal, imagenDeTropa);
        }
    }

     */

    public void bajarVidaDelAyuntamiento(int danio){
        if(getCoordenadaV() == 6 && getCoordenadaH() == 10 || getCoordenadaV() == 7 && getCoordenadaH() == 10 || getCoordenadaV() == 8 && getCoordenadaH() == 10){
            ayuntamiento.setVida(ayuntamiento.getVida() - danio);
        }
    }
    public void darOroAlAyuntamiento(){
        ayuntamiento.setOro(ayuntamiento.getOro() + oroAlMorir);
    }

    public void executeLater(Runnable r, int ms) {
        game.executeLater(r, ms);
    }

}
