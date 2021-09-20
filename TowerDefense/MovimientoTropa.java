package edu.upb.lp.progra.TowerDefense;

public class MovimientoTropa implements Runnable {

    private TowerDefenseGame game;
    private Ayuntamiento ayuntamiento;
    private boolean running = false;

    public MovimientoTropa(TowerDefenseGame game) {
        this.game = game;
    }
    public MovimientoTropa(Ayuntamiento ayuntamiento) {
        this.ayuntamiento = ayuntamiento;
    }

    public void start() {
        if (!running) {
            running = true;
            run();
        }
    }

    public void stop() {
        running = false;
    }


    @Override
    public void run() {
       if (running) {
           ayuntamiento.iniciarMovimiento(6,0,"tropa_tipo1");
           ayuntamiento.iniciarMovimiento(7,0,"tropa_tipo3");
           ayuntamiento.iniciarMovimiento(8,0,"tropa_tipo4");
           ayuntamiento.executeLater(this);
        }

    }
}
