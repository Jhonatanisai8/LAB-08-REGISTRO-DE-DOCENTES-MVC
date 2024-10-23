package servicios;

import datos.Constantes;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FormatoTabla
        implements Constantes {

    public static void achoColumas(JTable tblData) {
        for (int i = 0; i < ANCHO_COLUMAS.length; i++) {
            tblData.getColumnModel().getColumn(i).setPreferredWidth(ANCHO_COLUMAS[i]);
        }
    }

    public static DefaultTableModel modeloTabla(JTable tblData) {
        DefaultTableModel modelo = new DefaultTableModel(null, ENCABEZADO_TABLA);
        tblData.setModel(modelo);
        return modelo;
    }
}
