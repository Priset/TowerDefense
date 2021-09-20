package edu.upb.lp.progra.TowerDefense;

public class MovimientoTropa implements Runnable {

    private Ayuntamiento ayuntamiento;
    private boolean running = false;


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
           ayuntamiento.iniciarMovimiento();
           ayuntamiento.executeLater(this);
        }
    }
}
