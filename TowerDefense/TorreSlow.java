package edu.upb.lp.progra.TowerDefense;

public class TorreSlow extends Torre{

    public TorreSlow(int vertical, int horizontal, TowerDefenseGame game) {
        super(200,300,300,vertical,horizontal,500,"construccion_torre", "torre_tipo2", "torre_tipo2_mejora", "upgrade_torre",game);
    }

    @Override
    public void atacarCasilla() {
        if(tropa.getCoordenadaV() == 6 && tropa.getCoordenadaH() == 1 ||tropa.getCoordenadaV() == 7 && tropa.getCoordenadaH() == 2 || tropa.getCoordenadaV() == 6 && tropa.getCoordenadaH() == 2 ||
                tropa.getCoordenadaV() == 8 && tropa.getCoordenadaH() == 1 || tropa.getCoordenadaV() == 8 && tropa.getCoordenadaH() == 2 ||tropa.getCoordenadaV() == 7 && tropa.getCoordenadaH() == 1 ||
                tropa.getCoordenadaV() == 2 && tropa.getCoordenadaH() == 5 || tropa.getCoordenadaV() == 3 && tropa.getCoordenadaH() == 6 ||tropa.getCoordenadaV() == 4 && tropa.getCoordenadaH() == 5 ||
                tropa.getCoordenadaV() == 5 && tropa.getCoordenadaH() == 7 || tropa.getCoordenadaV() == 6 && tropa.getCoordenadaH() == 9 ||tropa.getCoordenadaV() == 7 && tropa.getCoordenadaH() == 8  ) {
            atacT.start();
            tropa.setVida(tropa.getVida() - getDanio());
            if(tropa.getVida() <= 0){
                tropa = null;
                tropa.darOroAlAyuntamiento();
            }
        }
    }
}
