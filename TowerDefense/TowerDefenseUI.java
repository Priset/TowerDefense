package edu.upb.lp.progra.TowerDefense;

        import edu.upb.lp.progra.adapterFiles.AndroidGameGUI;
        import edu.upb.lp.progra.adapterFiles.UI;

public class TowerDefenseUI implements UI {

    private AndroidGameGUI gui;
    private TowerDefenseGame game = new TowerDefenseGame (this);
    private boolean comenzarNivel = false;

    public TowerDefenseUI(AndroidGameGUI gui) {

        this.gui = gui;
    }

    public void reproduccion(String sound) {

        gui.reproduceSound(sound);
    }

    public void cambiarImagenColorTorre(String imagenDeColor, int vertical, int horizontal) {
        gui.setImageOnCell(vertical, horizontal, imagenDeColor);
        gui.reproduceSound("construccion_torre");
    }

    public void cambiarImagenUpgradeTorre(String imagenDeMejora, int vertical, int horizontal) {
        gui.setImageOnCell(vertical, horizontal, imagenDeMejora);
        gui.reproduceSound("upgrade_torre");
    }

    public void verOro(int oro) {
        gui.showTemporaryMessage("Cantidad de Oro: " + oro);
    }

    public void verVida(int vida) {
        gui.showTemporaryMessage("Vida restante: " + vida);
    }

    public void botonReset() {
        gui.stopSounds();
        primerNivel();
    }
    public void oroInsuficiente() {

        gui.showTemporaryMessage("No tienes suficiente oro");
    }
    public void oroInsuficienteDeMejora() {
        gui.showTemporaryMessage("No tienes oro para la mejora");
    }

    public void inicioDeEnemigos() {
        gui.setImageOnCell(6,0,"tropa_tipo1");
        gui.setImageOnCell(7,0,"tropa_tipo3");
        gui.setImageOnCell(8,0,"tropa_tipo4");
    }

    public void executeLater(Runnable r, int ms) {
        gui.executeLater(r, ms);
    }

    @Override
    public void onButtonPressed(String name) {
    }

    @Override
    public void onCellPressed(int vertical, int horizontal) {
        if(comenzarNivel){
            game.presionarCasilla(vertical,horizontal);
        } else {
            comenzarNivel = true;
            primerNivel();
        }
    }

    @Override
    public void initialiseInterface() {
        gui.stopSounds();
        gui.configureScreen(1, 1, 0, 0, false, 0);
        gui.setImageOnCell(0,0,"inicio");
        reproduccion("intro");
    }

    private void primerNivel() {
        gui.configureScreen(11, 11, 0, 0, false, 0);
        //game.colaDeEnemigos();

        for (int v = 0; v < 11; v++) {
            for (int h = 0; h < 11; h++) {
                gui.setImageOnCell(v, h, "cesped");
            }
        }
        gui.stopSounds();
        reproduccion("desarrollo");

        //Camino
        gui.setImageOnCell(6, 0, "paja");
        gui.setImageOnCell(7, 0, "paja");
        gui.setImageOnCell(8, 0, "paja");

        gui.setImageOnCell(6, 1, "paja");
        gui.setImageOnCell(7, 1, "paja");
        gui.setImageOnCell(8, 1, "paja");

        gui.setImageOnCell(3, 2, "paja");
        gui.setImageOnCell(4, 2, "paja");
        gui.setImageOnCell(5, 2, "paja");
        gui.setImageOnCell(6, 2, "paja");
        gui.setImageOnCell(7, 2, "paja");
        gui.setImageOnCell(8, 2, "paja");

        gui.setImageOnCell(3, 3, "paja");
        gui.setImageOnCell(4, 3, "paja");
        gui.setImageOnCell(5, 3, "paja");
        gui.setImageOnCell(6, 3, "paja");
        gui.setImageOnCell(7, 3, "paja");
        gui.setImageOnCell(8, 3, "paja");

        gui.setImageOnCell(3, 4, "paja");
        gui.setImageOnCell(4, 4, "paja");
        gui.setImageOnCell(5, 4, "paja");
        gui.setImageOnCell(6, 4, "paja");
        gui.setImageOnCell(7, 4, "paja");
        gui.setImageOnCell(8, 4, "paja");

        gui.setImageOnCell(2, 5, "paja");
        gui.setImageOnCell(3, 5, "paja");
        gui.setImageOnCell(4, 5, "paja");
        gui.setImageOnCell(5, 5, "paja");

        gui.setImageOnCell(2, 6, "paja");
        gui.setImageOnCell(3, 6, "paja");
        gui.setImageOnCell(4, 6, "paja");
        gui.setImageOnCell(5, 6, "paja");
        gui.setImageOnCell(6, 6, "paja");
        gui.setImageOnCell(7, 6, "paja");
        gui.setImageOnCell(8, 6, "paja");

        gui.setImageOnCell(2, 7, "paja");
        gui.setImageOnCell(3, 7, "paja");
        gui.setImageOnCell(4, 7, "paja");
        gui.setImageOnCell(5, 7, "paja");
        gui.setImageOnCell(6, 7, "paja");
        gui.setImageOnCell(7, 7, "paja");
        gui.setImageOnCell(8, 7, "paja");

        gui.setImageOnCell(2, 8, "paja");
        gui.setImageOnCell(3, 8, "paja");
        gui.setImageOnCell(4, 8, "paja");
        gui.setImageOnCell(5, 8, "paja");
        gui.setImageOnCell(6, 8, "paja");
        gui.setImageOnCell(7, 8, "paja");
        gui.setImageOnCell(8, 8, "paja");

        gui.setImageOnCell(6, 9, "paja");
        gui.setImageOnCell(7, 9, "paja");
        gui.setImageOnCell(8, 9, "paja");

        //Lava
        gui.setImageOnCell(7, 5, "lava");
        gui.setImageOnCell(4, 0, "lava");
        gui.setImageOnCell(4, 1, "lava");
        gui.setImageOnCell(9, 10, "lava");
        gui.setImageOnCell(5, 10, "lava");
        gui.setImageOnCell(4, 10, "lava");
        gui.setImageOnCell(4, 9, "lava");
        gui.setImageOnCell(1, 6, "lava");

        gui.setImageOnCell(5, 0, "lava");
        gui.setImageOnCell(9, 0, "lava");
        gui.setImageOnCell(10, 0, "lava");

        gui.setImageOnCell(10, 1, "lava");
        gui.setImageOnCell(10, 2, "lava");
        gui.setImageOnCell(10, 3, "lava");
        gui.setImageOnCell(10, 4, "lava");
        gui.setImageOnCell(10, 5, "lava");
        gui.setImageOnCell(10, 6, "lava");
        gui.setImageOnCell(10, 7, "lava");
        gui.setImageOnCell(10, 8, "lava");
        gui.setImageOnCell(10, 9, "lava");
        gui.setImageOnCell(10, 10, "lava");

        //Torres
        gui.setImageOnCell(3, 1, "torre_tipo1_bn");
        gui.setImageOnCell(5, 1, "torre_tipo2_bn");
        gui.setImageOnCell(9, 1, "torre_tipo2_bn");

        gui.setImageOnCell(2, 3, "torre_tipo3_bn");
        gui.setImageOnCell(9, 3, "torre_tipo1_bn");

        gui.setImageOnCell(1, 5, "torre_tipo2_bn");
        gui.setImageOnCell(6, 5, "torre_tipo3_bn");
        gui.setImageOnCell(8, 5, "torre_tipo1_bn");

        gui.setImageOnCell(9, 6, "torre_tipo1_bn");

        gui.setImageOnCell(1, 7, "torre_tipo3_bn");

        gui.setImageOnCell(9, 8, "torre_tipo3_bn");

        gui.setImageOnCell(2, 9, "torre_tipo1_bn");
        gui.setImageOnCell(5, 9, "torre_tipo2_bn");

        //Ayuntamiento
        gui.setImageOnCell(6, 10, "ayuntamiento_arriba");
        gui.setImageOnCell(7, 10, "ayuntamiento_medio");
        gui.setImageOnCell(8, 10, "ayuntamiento_abajo");

        //Botones

        gui.setImageOnCell(0, 0, "ver_oro");
        gui.setImageOnCell(1, 0, "ver_vida");
        gui.setImageOnCell(0, 10, "reset");
        gui.setImageOnCell(0,9,"start");

        //Botones de compra
        gui.setImageOnCell(0,1,"comprar_torre_farm");
        gui.setImageOnCell(0,2,"comprar_torre_slow");
        gui.setImageOnCell(0,3,"comprar_torre_sauron");
        gui.setImageOnCell(1,1,"mejorar_torre_farm");
        gui.setImageOnCell(1,2,"mejorar_torre_slow");
        gui.setImageOnCell(1,3,"mejorar_torre_sauron");

        inicioDeEnemigos();
    }

    public void finDePartida() {
        gui.stopSounds();
        gui.configureScreen(1, 1, 0, 0, false, 0);
        gui.setImageOnCell(0,0,"game_over");
    }

    public void ayuntaQuemado() {
        gui.setImageOnCell(6, 10, "ayuntamiento_quemado_arriba");
        gui.setImageOnCell(7, 10, "ayuntamiento_quemado_medio");
        gui.setImageOnCell(8, 10, "ayuntamiento_quemado_abajo");
    }

    public void ganaste() {
        gui.stopSounds();
        gui.configureScreen(1, 1, 0, 0, false, 0);
        gui.setImageOnCell(0,0,"you_win");
    }

    public void cambiarImagenDePosicion(int vertical, int horizontal, String imagenDeTropa) {
        gui.setImageOnCell(vertical,horizontal,imagenDeTropa);
    }

    public void borrarImagenDePosicion(int vertical, int horizontal) {
        gui.setImageOnCell(vertical,horizontal,"paja");
    }
}
