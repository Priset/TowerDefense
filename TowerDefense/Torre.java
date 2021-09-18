package edu.upb.lp.progra.TowerDefense;

public abstract class Torre {

    protected TowerDefenseGame game;
    protected Tropa tropa;
    private int danio;
    private int precio;
    private int precioDeMejora;
    private int danioUpgrade;
    private String soundOfConstruction;
    private String soundOfUpgrade;
    private String imagenDeTorreColor;
    private String imagenDeMejora;

    private int coordenadaVertical;
    private int coordenadaHorizontal;

    public Torre(int danio, int precio, int precioDeMejora, int vertical, int horizontal, int danioUpgrade, String soundOfConstruction, String imagenDeTorreColor, String imagenDeMejora, String soundOfUpgrade, TowerDefenseGame game) {
        this.danio = danio;
        this.precio = precio;
        this.precioDeMejora = precioDeMejora;
        this.danioUpgrade = danioUpgrade;
        this.coordenadaVertical = vertical;
        this.coordenadaHorizontal = horizontal;
        this.soundOfConstruction = soundOfConstruction;
        this.imagenDeTorreColor = imagenDeTorreColor;
        this.imagenDeMejora = imagenDeMejora;
        this.soundOfUpgrade = soundOfUpgrade;
        this.game = game;
    }

    public int getDanio() {

        return danio;
    }

    public void setDanio(int danio) {

        this.danio = danio;
    }

    public int getPrecio() {

        return precio;
    }

    public void setPrecio(int precio) {

        this.precio = precio;
    }

    public int getPrecioDeMejora() {

        return precioDeMejora;
    }

    public void setPrecioDeMejora(int precioDeMejora) {

        this.precioDeMejora = precioDeMejora;
    }

    public int getCoordenadaVertical() {
        return coordenadaVertical;
    }

    public int getCoordenadaHorizontal() {
        return coordenadaHorizontal;
    }

    public abstract void atacarCasilla(int vertical, int horizontal);

    public void executeLater(Runnable r, int t) {
        game.executeLater(r, t);
    }



}
