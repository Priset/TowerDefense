package edu.upb.lp.progra.TowerDefense;

public class TorreSauron extends Torre {

    public TorreSauron(int vertical, int horizontal, TowerDefenseGame game) {
        super(300,400,3000,vertical,horizontal,1000,"construccion_torre", "torre_tipo3", "torre_tipo3_mejora", "upgrade_torre",game);
    }


    @Override
    public void atacarCasilla(int vertical, int horizontal) {
        if(vertical == 3 && horizontal == 2 || vertical == 3 && horizontal == 3 ||
                vertical ==3 && horizontal ==4 || vertical == 5 && horizontal == 2 ||
                vertical == 7 &&horizontal == 4 ||vertical == 2 && horizontal == 7 ||
                vertical == 2 &&horizontal == 8 ||vertical == 4 &&horizontal == 8 ||
                vertical == 3 &&horizontal == 5 ||vertical == 6 &&horizontal == 8 ||
                vertical == 8 &&horizontal == 8 ||vertical == 8 &&horizontal == 7 ||
                vertical == 8 &&horizontal == 9 ||vertical == 7 &&horizontal == 6 ||
               vertical == 7 &&horizontal == 9 ||vertical == 6 &&horizontal == 4 ||
               vertical == 5 &&horizontal == 5 ||vertical == 6 &&horizontal == 6 ||
               vertical == 5 &&horizontal == 4 ||vertical == 5 &&horizontal == 6 ) {
            //hacerDanio();
        }
    }

    @Override
    public void hacerDanio() {
        ayuntamiento.tropasRecibirDanio(300);
    }

}
