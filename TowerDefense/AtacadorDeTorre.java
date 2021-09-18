package edu.upb.lp.progra.TowerDefense;

public class AtacadorDeTorre implements Runnable {
    private Torre torre;
    private boolean running = false;

    public AtacadorDeTorre(Torre t) {
        this.torre = torre;
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
            torre.atacarCasilla(0,0);
            torre.executeLater(this, 1000);
        }
    }
}
