package edu.upb.lp.progra.TowerDefense;

public class AtacadorDeTorre implements Runnable {

    private TowerDefenseGame game;
    private Ayuntamiento ayuntamiento;
    private boolean running = false;

    public AtacadorDeTorre(TowerDefenseGame game) {
        this.game = game;
    }
    public AtacadorDeTorre(Ayuntamiento ayuntamiento) {

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
           // game.iniciarAtaque();
            ayuntamiento.executeLaterTorre(this);
        }
    }
}
