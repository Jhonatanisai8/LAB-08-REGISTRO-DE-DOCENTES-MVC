package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.DocentePregado;
import procesos.ProcesosDocente;
import servicios.FormatoTabla;
import vista.frmRegistroDocente;

public class ControladorDocente
        implements ActionListener {
    
    private frmRegistroDocente vista;
    private DocentePregado docentePregado;
    private DefaultTableModel modelo;
    
    public ControladorDocente(frmRegistroDocente frm) {
        this.vista = frm;
        this.vista.btnNuevo.addActionListener(this);
        this.vista.btnRegistrar.addActionListener(this);
        modelo = FormatoTabla.modeloTabla(this.vista.tblDatos);
        FormatoTabla.achoColumas(this.vista.tblDatos);
        ProcesosDocente.presentarFormulario(this.vista);        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.btnRegistrar) {
            docentePregado = ProcesosDocente.crearEsDocentePregado(this.vista);
            modelo.addRow(docentePregado.registro());
        }
        
        if (e.getSource() == this.vista.btnNuevo) {
            ProcesosDocente.limpiarEntradas(vista);
        }
    }
    
}
