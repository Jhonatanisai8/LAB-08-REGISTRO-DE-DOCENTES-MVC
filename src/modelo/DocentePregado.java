package modelo;

import datos.Acciones;
import datos.Constantes;
import java.text.DecimalFormat;

public class DocentePregado extends Docente
        implements Constantes, Acciones {

    private String categoria;
    private Long aniosExperiencia;

    private static Long contador = 0L;

    public DocentePregado() {
        contador++;
        super.setCodigo(generarCodigo(contador));
    }

    @Override
    public String generarCodigo(Long n) {
        DecimalFormat df = new DecimalFormat("DEPRE000");
        return df.format(contador);
    }

    @Override
    public double sueldoBase() {
        double monto = 0;
        //principal
        if (this.categoria.equalsIgnoreCase(LISTA_CATEGORIAS[0])) {
            if (super.getEspecialidad().equalsIgnoreCase(LISTA_ESPECIALIDADES[0])) {
                monto = LISTA_SUELDOBASE_REDES[0];
            } else {
                monto = LISTA_SUELDOBASE_REDES[1];
            }
        }

        //asociado
        if (this.categoria.equalsIgnoreCase(LISTA_CATEGORIAS[1])) {
            if (super.getEspecialidad().equalsIgnoreCase(LISTA_ESPECIALIDADES[0])) {
                monto = LISTA_SUELDOBASE_TECNOLOGIAS_INFORMACINO[0];
            } else {
                monto = LISTA_SUELDOBASE_TECNOLOGIAS_INFORMACINO[1];
            }
        }

        return monto;
    }

    @Override
    public double calcularDescuento() {
        double montoAfp = PORCENTAJE_AFP * sueldoBase();
        double montoEssalud = PORCENTAJE_ESSALUD * sueldoBase();
        return sueldoBase() - montoAfp - montoEssalud;
    }

    public double montoMovilidad() {
        double monto = 0;
        switch (categoria) {
            case "Principal" ->
                monto = 700;
            case "Asociado" ->
                monto = 400;
        }
        return monto;
    }

    public Object[] registro() {
        Object[] fila = {contador,
            super.getCodigo(),
            super.getNombres(),
            super.getApellidos(),
            super.getEspecialidad(),
            super.getHorasClase(),
            getCategoria(),
            getAniosExperiencia(),
            sueldoBase(),
            calcularDescuento(),
            montoMovilidad(),};
        return fila;
    }

    public String getCategoria() {return categoria;}
    public void setCategoria(String categoria) {this.categoria = categoria;}
    public Long getAniosExperiencia() {return aniosExperiencia;}
    public void setAniosExperiencia(Long aniosExperiencia) {this.aniosExperiencia = aniosExperiencia;}
    public static Long getContador() {return contador;}
    public static void setContador(Long contador) {DocentePregado.contador = contador; }

}
