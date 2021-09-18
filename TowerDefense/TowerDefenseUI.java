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

    public void executeLater(Runnable r, int ms) {
        gui.executeLater(r, ms);
    }

    @Override
    public void onButtonPressed(String name) {
    }

    @Override
    public void onCellPressed(int vertical, int horizontal) {
        if(comenzarNivel){
            game.presionarCasillaPrimerNivel(vertical,horizontal);
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
        game.colaDeEnemigos();

        for (int v = 0; v < 11; v++) {
            for (int h = 0; h < 11; h++) {
                gui.setImageOnCell(v, h, "cesped");
            }
        }
        gui.stopSounds();
        reproduccion("desarrollo");

        gui.setImageOnCell(0,1,"tablon");
        gui.setImageOnCell(0,2,"tablon");
        gui.setImageOnCell(0,3,"tablon");
        gui.setImageOnCell(1,1,"tablon");
        gui.setImageOnCell(1,2,"tablon");
        gui.setImageOnCell(1,3,"tablon");

        //Nivel 1 - Camino
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

        //Nivel 1 - Torres
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

        //Nivel 1 - Ayuntamiento
        gui.setImageOnCell(6, 10, "ayuntamiento_arriba");
        gui.setImageOnCell(7, 10, "ayuntamiento_medio");
        gui.setImageOnCell(8, 10, "ayuntamiento_abajo");

        //Nivel 1 - Botones

        gui.setImageOnCell(0, 0, "ver_oro");
        gui.setImageOnCell(1, 0, "ver_vida");
        gui.setImageOnCell(0, 10, "reset");
    }
}
