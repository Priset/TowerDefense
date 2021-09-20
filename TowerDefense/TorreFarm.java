package edu.upb.lp.progra.TowerDefense;

public class TorreFarm extends Torre{

    public TorreFarm(int vertical, int horizontal, TowerDefenseGame game) {
        super(100,150,150,vertical,horizontal,200,"construccion_torre", "torre_tipo1", "torre_tipo1_mejora", "upgrade_torre",game);
    }


    @Override
    public void atacarCasilla(int vertical, int horizontal) {
        if(vertical == 4 && horizontal == 2 ||vertical == 4 && horizontal == 3 ||
                vertical == 8 && horizontal == 3 || vertical == 7 && horizontal == 3 ||
                vertical == 6 && horizontal == 3 || vertical == 8 && horizontal == 4 ||
                vertical == 3 && horizontal == 7 || vertical == 8 && horizontal == 6 ||
                vertical == 7 && horizontal == 7 || vertical == 3 && horizontal == 8) {
            hacerDanio();
        }
    }

    @Override
    public void hacerDanio() {
        ayuntamiento.tropasRecibirDanio(100);
    }


}
