package edu.upb.lp.progra.TowerDefense;

public class Tropa {

    private Ayuntamiento ayuntamiento;
    private String tipoDeTropa;
    private int vida;
    private int danio;
    private int oroAlMorir;
    private String imagenDeTropa;
    private int coordenadaV;
    private int coordenadaH;


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


    public void bajarVidaDelAyuntamiento(int danio){
        if(getCoordenadaV() == 6 && getCoordenadaH() == 10 || getCoordenadaV() == 7 && getCoordenadaH() == 10 || getCoordenadaV() == 8 && getCoordenadaH() == 10){
            ayuntamiento.setVida(ayuntamiento.getVida() - danio);
        }
    }
    public void darOroAlAyuntamiento(){
        ayuntamiento.setOro(ayuntamiento.getOro() + oroAlMorir);
    }


}
