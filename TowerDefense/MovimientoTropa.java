package edu.upb.lp.progra.TowerDefense;

public class MovimientoTropa implements Runnable {


    private final Tropa tropa;
    private Ayuntamiento ayuntamiento;
    private boolean running = false;

    public MovimientoTropa(Tropa tropa) {
        this.tropa = tropa;
    }

    public void start() {
        if (!running) {
            running = true;
            run();
        }
    }

    public void stop() {
        if (ayuntamiento.getVida() <= 0)
        running = false;
    }

    @Override
    public void run() {
        if (running) {
            tropa.darPaso();
            tropa.executeLater(this, 1000);
        }
    }
}
