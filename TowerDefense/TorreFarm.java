package edu.upb.lp.progra.TowerDefense;

public class TorreFarm extends Torre{

    public TorreFarm(int vertical, int horizontal, TowerDefenseGame game) {
        super(100,150,150,vertical,horizontal,200,"construccion_torre", "torre_tipo1", "torre_tipo1_mejora", "upgrade_torre",game);
    }

    @Override
    public void atacarCasilla() {
        if(tropa.getCoordenadaV() == 4 && tropa.getCoordenadaH() == 2 ||tropa.getCoordenadaV() == 4 && tropa.getCoordenadaH() == 3 ||
                tropa.getCoordenadaV() == 8 && tropa.getCoordenadaH() == 3 ||tropa.getCoordenadaV() == 7 && tropa.getCoordenadaH() == 3 ||
                tropa.getCoordenadaV() == 6 && tropa.getCoordenadaH() == 3 || tropa.getCoordenadaV() == 8 && tropa.getCoordenadaH() == 4 ||
                tropa.getCoordenadaV() == 3 && tropa.getCoordenadaH() == 7 ||tropa.getCoordenadaV() == 8 && tropa.getCoordenadaH() == 6 ||
                tropa.getCoordenadaV() == 7 && tropa.getCoordenadaH() == 7 || tropa.getCoordenadaV() == 3 && tropa.getCoordenadaH() == 8) {
            atacT.start();
            tropa.setVida(tropa.getVida() - getDanio());
            if(tropa.getVida() <= 0){
                tropa = null;
                tropa.darOroAlAyuntamiento();
            }
        }
    }





}
