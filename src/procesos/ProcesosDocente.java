package procesos;

import datos.Constantes;
import modelo.DocentePregado;
import vista.frmRegistroDocente;

public class ProcesosDocente {

    public static void presentarFormulario(frmRegistroDocente f) {
        f.setTitle("REGISTRO DE DOCENTES PREGRADO");
        f.cbxCategoria.removeAllItems();
        f.cbxEspecialidad.removeAllItems();
        f.cbxEspecialidad.removeAllItems();

        for (String categoria : Constantes.LISTA_CATEGORIAS) {
            f.cbxCategoria.addItem(categoria);
        }

        for (String especialidad : Constantes.LISTA_ESPECIALIDADES) {
            f.cbxEspecialidad.addItem(especialidad);
        }

        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }

    public static void limpiarEntradas(frmRegistroDocente f) {
        f.txtApellidos.setText("");
        f.txtNombres.setText("");
        f.cbxCategoria.setSelectedIndex(0);
        f.cbxEspecialidad.setSelectedIndex(0);
        f.spnAniosExperiencia.setValue(0);
        f.spnHorasClase.setValue(0);
        f.txtApellidos.requestFocus();
    }

    public static DocentePregado crearEsDocentePregado(frmRegistroDocente f) {
        DocentePregado e = new DocentePregado();
        e.setApellidos(f.txtApellidos.getText());
        e.setNombres(f.txtNombres.getText());
        e.setAniosExperiencia(Long.parseLong(f.spnAniosExperiencia.getValue().toString()));
        e.setCategoria(f.cbxCategoria.getSelectedItem().toString());
        e.setEspecialidad(f.cbxEspecialidad.getSelectedItem().toString());
        e.setHorasClase(Long.parseLong(f.spnHorasClase.getValue().toString()));
        return e;
    }

}
