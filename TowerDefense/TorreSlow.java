package edu.upb.lp.progra.TowerDefense;

public class TorreSlow extends Torre{

    public TorreSlow(int vertical, int horizontal, TowerDefenseGame game) {
        super(200,300,300,vertical,horizontal,500,"construccion_torre", "torre_tipo2", "torre_tipo2_mejora", "upgrade_torre",game);
    }

    @Override
    public void atacarCasilla(int vertical, int horizontal) {

        if(vertical == 6 &&horizontal == 1 || vertical == 7 &&horizontal == 2 ||
               vertical == 6 &&horizontal == 2 ||vertical == 8 &&horizontal == 1 ||
               vertical == 8 &&horizontal == 2 ||vertical == 7 &&horizontal == 1 ||
               vertical == 2 &&horizontal == 5 ||vertical == 3 &&horizontal == 6 ||
               vertical == 4 &&horizontal == 5 ||vertical == 5 &&horizontal == 7 ||
               vertical == 6 &&horizontal == 9 ||vertical == 7 &&horizontal == 8  ) {
            hacerDanio();
        }
    }

    @Override
    public void hacerDanio() {
        ayuntamiento.tropasRecibirDanio(200);
    }


}
