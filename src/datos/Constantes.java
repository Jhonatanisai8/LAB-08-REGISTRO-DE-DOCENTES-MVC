package datos;

public interface Constantes {

    final String[] LISTA_ESPECIALIDADES = {"Redes", "Tecnologias de Informacion"};
    final String[] LISTA_CATEGORIAS = {"Principal", "Asociado"};
    final double[] LISTA_SUELDOBASE_REDES = {6000, 5000};
    final double[] LISTA_SUELDOBASE_TECNOLOGIAS_INFORMACINO = {8000, 7000};

    final double PORCENTAJE_AFP = 0.17;
    final double PORCENTAJE_ESSALUD = 0.05;
    final String ENCABEZADO_TABLA[] = {"NUMERO", "CODIGO DOCENTE", "NOMBRES", "APELLIDOS",
        "ESPECIALIDAD", "HORAS CLASE", "CATEGORIA", "AÑOS EXPERIENCIA", "SUELDO BASE",
        "CALCULAR DESCUENTO", "MONTO MOVILIDAD"};
    final int ANCHO_COLUMAS[] = {50, 80, 150, 150, 120, 50, 80, 80, 80, 80};

}
