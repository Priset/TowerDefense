package edu.upb.lp.progra.TowerDefense;

public class MovimientoTropa implements Runnable {
    private final Tropa tropa;
    private Ayuntamiento ayuntamiento;
    private boolean running = false;
    private int direccion;

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

    public void comenzarRecorrido(int direccion) {

        this.direccion = direccion;
    }


    @Override
    public void run() {
        if (running) {
            tropa.recorrido(direccion);
            tropa.executeLater(this, 300);
        }
    }
}
