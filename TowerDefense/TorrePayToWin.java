package edu.upb.lp.progra.TowerDefense;

public class TorrePayToWin extends Torre {

    public TorrePayToWin(int vertical, int horizontal, TowerDefenseGame game) {
        super(300,400,3000,vertical,horizontal,1000,"construccion_torre", "torre_tipo3", "torre_tipo3_mejora", "upgrade_torre",game);
    }


    @Override
    public void atacarCasilla(int vertical, int horizontal) {
        if(tropa.getCoordenadaV() == 3 && tropa.getCoordenadaH() == 2 || tropa.getCoordenadaV() == 3 && tropa.getCoordenadaH() == 3 || tropa.getCoordenadaV()==3 && tropa.getCoordenadaH()==4 ||
                tropa.getCoordenadaV() == 2 && tropa.getCoordenadaH() == 7 || tropa.getCoordenadaV() == 2 && tropa.getCoordenadaH() == 8 || tropa.getCoordenadaV()==4 && tropa.getCoordenadaH()==8 ||
                tropa.getCoordenadaV() == 8 && tropa.getCoordenadaH() == 8 || tropa.getCoordenadaV() == 8 && tropa.getCoordenadaH() == 7 || tropa.getCoordenadaV()==8 && tropa.getCoordenadaH()==9 ||
                tropa.getCoordenadaV() == 6 && tropa.getCoordenadaH() == 4 || tropa.getCoordenadaV() == 5 && tropa.getCoordenadaH() == 5 || tropa.getCoordenadaV()==6 && tropa.getCoordenadaH()==6) {
            tropa.setVida(tropa.getVida() - getDanio());
        }
    }

}