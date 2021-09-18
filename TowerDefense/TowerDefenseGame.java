package edu.upb.lp.progra.TowerDefense;

import java.util.LinkedList;
import java.util.List;

public class TowerDefenseGame {

    private TowerDefenseUI ui;

    private List<Torre> torres = new LinkedList<Torre>();

    Ayuntamiento ayunta = new Ayuntamiento("ayuntamiento_roto","ayuntamiento_quemado_arriba",
            "ayuntamiento_quemado_medio", "ayuntamiento_quemado_abajo",this);


    public TowerDefenseGame(TowerDefenseUI ui) {
        this.ui = ui;
    }



    public void cambiarImagenColor(String imagenDeTorreColor, int vertical, int  horizontal) {
        ui.cambiarImagenColorTorre(imagenDeTorreColor, vertical, horizontal);
     }

    private void cambiarImagenUpgrade(String imagenDeMejora,int vertical, int  horizontal) {
        ui.cambiarImagenUpgradeTorre(imagenDeMejora, vertical, horizontal);
    }

    public void comprarTorreFarm(int vertical, int horizontal,int precio){
        if(ayunta.getOro() >= precio) {
            ayunta.bajarOro(precio);
            cambiarImagenColor("torre_tipo1", vertical, horizontal);
            torres.add(new TorreFarm(vertical,horizontal,this));
        } else {
            ui.oroInsuficiente();
        }
    }

    public void comprarTorreSlow(int vertical, int horizontal,int precio){
        if(ayunta.getOro() >= precio) {
            ayunta.bajarOro(precio);
            cambiarImagenColor("torre_tipo2", vertical, horizontal);
            torres.add(new TorreSlow(vertical,horizontal,this));
        } else {
            ui.oroInsuficiente();
        }
    }

    public void comprarTorrePayToWin(int vertical, int horizontal,int precio){
        if(ayunta.getOro() >= precio) {
            ayunta.bajarOro(precio);
            cambiarImagenColor("torre_tipo3", vertical, horizontal);
            torres.add(new TorreSauron(vertical,horizontal,this));
        } else {
            ui.oroInsuficiente();
        }
    }

    public void upgradeDeTorreFarm(int vertical, int  horizontal, int precioDeMejora){
        if(ayunta.getOro() >= precioDeMejora){
            ayunta.bajarOroDeMejora(precioDeMejora);
            cambiarImagenUpgrade("torre_tipo1_mejora", vertical, horizontal);
        } else {
           ui.oroInsuficienteDeMejora();
        }
    }

    public void upgradeDeTorreSlow(int vertical, int  horizontal, int precioDeMejora){
        if(ayunta.getOro() >= precioDeMejora){
            ayunta.bajarOroDeMejora(precioDeMejora);
            cambiarImagenUpgrade("torre_tipo2_mejora", vertical, horizontal);
        } else {
            ui.oroInsuficienteDeMejora();
        }
    }
    public void upgradeDeTorrePayToWin(int vertical, int  horizontal, int precioDeMejora){
        if(ayunta.getOro() >= precioDeMejora){
            ayunta.bajarOroDeMejora(precioDeMejora);
            cambiarImagenUpgrade("torre_tipo3_mejora",  vertical, horizontal);
        } else {
            ui.oroInsuficienteDeMejora();
        }
    }

    public void presionarCasilla(int vertical, int horizontal) {
        if (vertical == 0 && horizontal == 0) {
            ui.verOro(ayunta.getOro());
        } else if (vertical == 1 && horizontal == 0) {
            ui.verVida(ayunta.getVida());
        } else if (vertical == 0 && horizontal == 10) {
            botonSuperMegaSorroReset();
        } else if (vertical == 0 && horizontal == 1){
            comprarTorreFarm(3,1,150);
            comprarTorreFarm(9,3,150);
            comprarTorreFarm(8,5,150);
            comprarTorreFarm(9,6,150);
            comprarTorreFarm(2,9,150);
        } else if(vertical == 0 && horizontal == 2){
            comprarTorreSlow(5,1,300);
            comprarTorreSlow(9,1,300);
            comprarTorreSlow(1,5,300);
            comprarTorreSlow(5,9,300);
        } else if(vertical == 0 && horizontal == 3){
            comprarTorrePayToWin(2,3,400);
            comprarTorrePayToWin(6,5,400);
            comprarTorrePayToWin(1,7,400);
            comprarTorrePayToWin(9,8,400);
        } else if(vertical == 1 && horizontal == 1){
            upgradeDeTorreFarm(3,1,300);
            upgradeDeTorreFarm(9,3,300);
            upgradeDeTorreFarm(8,5,300);
            upgradeDeTorreFarm(9,6,300);
            upgradeDeTorreFarm(2,9,300);
        } else if(vertical == 1 && horizontal == 2){
            upgradeDeTorreSlow(5,1,600);
            upgradeDeTorreSlow(9,1,600);
            upgradeDeTorreSlow(1,5,600);
            upgradeDeTorreSlow(5,9,600);
        } else if(vertical == 1 && horizontal == 3){
            upgradeDeTorrePayToWin(2,3,800);
            upgradeDeTorrePayToWin(6,5,800);
            upgradeDeTorrePayToWin(1,7,800);
            upgradeDeTorrePayToWin(9,8,800);
        } else if(vertical == 0 && horizontal== 9){
            iniciarPartida();
        }
    }

    public void botonSuperMegaSorroReset(){
        ui.botonReset();
        ayunta.resetOro();
        torres.removeAll(torres);
    }

    public void aparicionDeEnemigos(){
        ui.inicioDeEnemigos();
    }

    public void iniciarPartida(){
        ayunta.enemigosActivos();
        /*for(int i = 0; i <= torres.size(); i++){
            torres.get(i).atacarCasilla();
        }

         */
    }

    public void executeLater(Runnable r, int ms) {
        ui.executeLater(r, ms);
    }

    public void perdiste() {
        ui.finDePartida();
        //TODO HACER QUE AL APRETAR LA MATRIZ VUELVAS AL MENU
    }

    public void ayuntamientoQuemandose() {


        ui.ayuntaQuemado();
    }

    public void ganaste() {
        ui.ganaste();
    }

    public void cambioDePosicion(int vertical, int horizontal, String imagenDeTropa) {
        ui.cambiarImagenDePosicion(vertical,horizontal, imagenDeTropa);
    }

    public void borrarPosicionAnterior(int vertical, int horizontal) {
        horizontal = horizontal -1;
        ui.borrarImagenDePosicion(vertical,horizontal);
    }


    //TODO borrar personaje de la pantalla (vertical, horizontal)
    //TODO UI.(VERTICAL,HORIZONTAL) GUI.SETIMAGEONCELL(PAJA)
}
