package edu.upb.lp.progra.TowerDefense;

public class MovimientoTropa implements Runnable {


    private final Tropa tropa;
    private Ayuntamiento ayuntamiento;
    private boolean running = false;
    private int coordenadaV;
    private int coordenadaH;

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

    public void comenzarRecorrido(int vertical, int horizontal) {
        this.coordenadaV = vertical;
        this.coordenadaH = horizontal;
    }


    @Override
    public void run() {
        if (running) {
            tropa.recorrido(coordenadaV, coordenadaH);
            tropa.executeLater(this, 300);
        }
    }
}
