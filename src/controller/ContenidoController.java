
package controller;

import view.ConsolaView;

public class ContenidoController {
    private ConsolaView vista = new ConsolaView();

    public void iniciar() {
        vista.mostrarMenu();
    }
}
