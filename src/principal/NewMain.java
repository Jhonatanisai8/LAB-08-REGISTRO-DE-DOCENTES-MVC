package principal;

import controlador.ControladorDocente;
import vista.frmRegistroDocente;

public class NewMain {

    public static void main(String[] args) {
        frmRegistroDocente de = new frmRegistroDocente();
        ControladorDocente cd = new ControladorDocente(de);
    }

}
