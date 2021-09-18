package edu.upb.lp.progra.TowerDefense;

public class Tropa {

    private TowerDefenseGame game;
    private String tipoDeTropa;
    private int vida;
    private int danio;
    private int oroAlMorir;
    private String imagenDeTropa;
    private int coordenadaV;
    private int coordenadaH;
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

    public int getCoordenadaH(){
        return coordenadaH;
    }

    public void recorrido(int direccion) {
            moveT.comenzarRecorrido(direccion);
            movimiento(direccion);
           /* if(direccion == 3) {
                coordenadaH += 1;
            }

            */
    }

    public void executeLater(Runnable r, int ms) {
        game.executeLater(r, ms);
    }

    public void movimiento(int direccion){
        //w = arriba
        //s = abajo
        //d = derecha
        int w = coordenadaV +1;
        int s = coordenadaV -1;
        int d = coordenadaH +1;
        int[][]movimiento=
                        {{0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,d,d,d,s,0,0},
                        {0,0,d,d,d,w,d,s,s,0,0},
                        {0,0,w,d,d,d,w,s,s,0,0},
                        {0,0,w,w,d,d,s,s,s,0,0},
                        {d,d,w,w,w,0,s,s,d,d,0},
                        {d,d,d,w,w,0,s,d,d,d,0},
                        {d,d,d,d,w,0,d,d,d,d,0},
                        {0,0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0,0}};
    }

}
