package edu.upb.lp.progra.TowerDefense;

import java.util.LinkedList;
import java.util.List;

public class TowerDefenseGame {

    private TowerDefenseUI ui;

    private List<Torre> torres = new LinkedList<Torre>();

    Ayuntamiento ayunta = new Ayuntamiento("ayuntamiento_roto","ayuntamiento_quemado_arriba",
            "ayuntamiento_quemado_medio", "ayuntamiento_quemado_abajo",this);

    //1 = arriba
    //2 = abajo
    //3 = derecha
    private int[][] camino = {
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,3,3,3,2,0,0},
            {0,0,3,3,3,1,3,2,2,0,0},
            {0,0,1,3,3,3,1,2,2,0,0},
            {0,0,1,1,3,3,2,2,2,0,0},
            {3,3,1,1,1,0,2,2,3,3,0},
            {3,3,3,1,1,0,2,3,3,3,0},
            {3,3,3,3,1,0,3,3,3,3,0},
            {0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0}};

    public  int getDireccionMatriz(int vertical, int horizontal){
        return camino[vertical][horizontal];
    }

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

            if (ayunta.getOro() >= precio) {
                try {
                    ayunta.bajarOro(precio);
                }catch (IllegalArgumentException e){
                    ui.oroNegativoException();
                }
                    cambiarImagenColor("torre_tipo1", vertical, horizontal);
                    torres.add(new TorreFarm(vertical, horizontal, this));

            } else {
                ui.oroInsuficiente();
            }

    }

    public void comprarTorreSlow(int vertical, int horizontal,int precio){
        if(ayunta.getOro() >= precio) {
            try {
                ayunta.bajarOro(precio);
            }catch (IllegalArgumentException e){
                ui.oroNegativoException();
            }
            cambiarImagenColor("torre_tipo2", vertical, horizontal);
            torres.add(new TorreSlow(vertical,horizontal,this));
        } else {
            ui.oroInsuficiente();
        }
    }

    public void comprarTorrePayToWin(int vertical, int horizontal,int precio){
        if(ayunta.getOro() >= precio) {
            try {
                ayunta.bajarOro(precio);
            }catch (IllegalArgumentException e){
                ui.oroNegativoException();
            }
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
        } else if(vertical == 0 && horizontal == 9){
            iniciarPartida();
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
            ayunta.empezar();
        /*for(int i = 0; i < torres.size(); i++){
            for(int h = 0; h <= 10; h++){
                for(int v = 0; v <= 10; v++){
                    torres.get(i).atacarCasilla(h,v);
                }
            }
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

    public void borrarPosicionAnterior(int coordenadaV, int coordenadaH) {
        ui.borrarImagenDePosicion(coordenadaV,coordenadaH);
    }

    public void alternativas(){
        ayunta.pocaVidaRestante();
        ayunta.partidaPerdida();
        ayunta.partidaGanada();
    }




}
